package com.fast.poi.excelModel;

import com.fast.poi.typeface.ForHigh;
import com.fast.poi.typeface.SheetName;
import com.fast.poi.typeface.TypefaceStyle;
import com.fast.poi.utils.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/**
 * 创建用户：杨辽
 * 创建时间：2016-12-03 09:22:00
 * 描    述：创建Excel
 */
public class IXSSFWorkbook {

    /**
     * 创建Excel Sheet页
     *
     * @param workbook Workbook workbook = new XSSFWorkbook(); ////XSSFWorkbook .xslx (>= 2007), HSSFWorkbook for 03 .xsl
     * @param object   生成表头的对象
     */
    public static Sheet NewSheet(Workbook workbook, Object object) throws Exception {

        Class sheetClazz = object.getClass();
        if (!sheetClazz.isAnnotationPresent(SheetName.class)) {
            throw new Exception("没有设置Sheet页");
        }

        //创建第一个Sheet页
        Sheet sheet = workbook.createSheet(((SheetName) sheetClazz.getAnnotation(SheetName.class)).value());

        //获取所有内部类对象属性
        Field[] totalRowClazzFields = sheetClazz.getDeclaredFields();
        for (int i = 0; i < totalRowClazzFields.length; i++) {
            Field field = totalRowClazzFields[i];
            //标记行
            Row sheetRow = sheet.createRow(i);

            if (field.isAnnotationPresent(ForHigh.class)) {
                ForHigh forHigh = field.getAnnotation(ForHigh.class);
                if (forHigh.value() != -1) {
                    sheetRow.setHeight((short) forHigh.value());
                }
            }

            //获取所有内部类对象
            Object rowObject = sheetClazz.getMethod("get" + StringUtils.captureName(field.getName())).invoke(object);

            if (null == rowObject) {
                throw new Exception("内部类对象为空！");
            }

            Class rowClass = rowObject.getClass();
            Field[] fields = rowClass.getDeclaredFields();
            int merge = 0;
            for (int j = 0; j < fields.length - 1; j++) {
                //获取所有内部类对象属性
                Field rowField = fields[j];

                TypefaceStyle typefaceStyle = rowField.getAnnotation(TypefaceStyle.class);
                if (rowField.isAnnotationPresent(TypefaceStyle.class)) {
                    if (typefaceStyle.columnWidth() != -1) {
                        sheet.setColumnWidth(j, typefaceStyle.columnWidth());
                    }
                }

                //添加表头数据
                Cell cell = sheetRow.createCell(j + merge);
                PoiData.addData(workbook, cell, rowObject, rowClass, rowField, typefaceStyle);

                //合并单元格
                merge = PoiData.mergeCell(workbook, sheet, sheetRow, rowClass, rowField, typefaceStyle, merge);
            }
        }
        return sheet;
    }

    /**
     * Sheet页中添加数据, 默认不添加数据样式
     *
     * @param workbook workbook
     * @param sheet    Sheet
     * @param listData 数据集合//List<Object>或者List<LinkedHashMap<String, String>>
     * @param row      数据起始行数
     */
    public static void addSheetData(Workbook workbook, Sheet sheet, List<?> listData, int row) throws Exception {
        addSheetData(workbook, sheet, listData, row, false);//这里默认传入0，可以近似与通过这个方法重载，实现了默认值
    }

    /**
     * Sheet页中添加数据
     *
     * @param workbook  workbook
     * @param sheet     Sheet
     * @param listData  数据集合//List<Object>或者List<LinkedHashMap<String, String>>
     * @param row       数据起始行数
     * @param dataStyle 是否添加数据行样式，数据类设置了样式添加行样式数据不能超过64000行,否则抛出java.lang.IllegalStateException: The maximum number of Cell Styles was exceeded. You can define up to 64000 style in a .xlsx Workbook
     */
    public static void addSheetData(Workbook workbook, Sheet sheet, List<?> listData, int row, boolean dataStyle) throws Exception {

        for (int j = 0; j < listData.size(); j++) {
            Object data = listData.get(j);

            //标记行
            Row sheetRow = sheet.createRow(row + j);

            //判断如果是List<LinkedHashMap<String, String>>
            if (data instanceof LinkedHashMap) {
                LinkedHashMap<String, String> map = (LinkedHashMap<String, String>) data;
                Set<String> set = map.keySet();
                int i = 0;
                for (String key : set) {
                    Cell cell = sheetRow.createCell(i);
                    cell.setCellValue(map.get(key));
                    i++;
                }
                continue;
            }

            Class dataClass = data.getClass();
            Field[] fields = dataClass.getDeclaredFields();

            for (int i = 0; i < fields.length; i++) {
                Field rowField = fields[i];

                Cell cell = sheetRow.createCell(i);

                if (dataStyle) {
                    //设置行高
                    if (rowField.isAnnotationPresent(ForHigh.class)) {
                        ForHigh forHigh = rowField.getAnnotation(ForHigh.class);
                        if (forHigh.value() != -1) {
                            sheetRow.setHeight((short) forHigh.value());
                        }
                    }

                    //如果设置了样式添加样式
                    if (rowField.isAnnotationPresent(TypefaceStyle.class)) {
                        TypefaceStyle typefaceStyle = rowField.getAnnotation(TypefaceStyle.class);
                        cell.setCellStyle(PoiCellStyle.addCellStyle(workbook, typefaceStyle));
                    }
                }

                Object o = dataClass.getMethod("get" + StringUtils.captureName(rowField.getName())).invoke(data);
                cell.setCellValue(null == o ? "" : o.toString());

            }
        }
    }

}
