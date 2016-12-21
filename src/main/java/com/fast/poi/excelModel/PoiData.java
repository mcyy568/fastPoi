package com.fast.poi.excelModel;

import com.fast.poi.typeface.TypefaceStyle;
import com.fast.poi.utils.MergeCell;
import com.fast.poi.utils.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

import java.lang.reflect.Field;

/**
 * 创建用户：杨辽
 * 创建时间：2016-12-03 09:43:00
 * 描    述：生成表头
 */
public class PoiData {

    //生成Excel表头
    static void addData(Workbook workbook, Cell cell, Object rowObject, Class rowClass, Field rowField, TypefaceStyle typefaceStyle) throws Exception {
        if (null != typefaceStyle) {
            cell.setCellStyle(PoiCellStyle.addCellStyle(workbook, typefaceStyle));
        }
        if (null == rowObject) {
            cell.setCellValue("");
        } else {
            cell.setCellValue(rowClass.getMethod("get" + StringUtils.captureName(rowField.getName())).invoke(rowObject).toString());
        }
    }

    //合并单元格//返回当前列数
    static int mergeCell(Workbook workbook, Sheet sheet, Row sheetRow, Class rowClass, Field rowField, TypefaceStyle typefaceStyle, int merge) throws Exception {
        if (null == typefaceStyle) {
            return merge;
        }

        if (MergeCell.WhetherToMerge(typefaceStyle.firstRow(), typefaceStyle.lastRow(), typefaceStyle.firstCol(), typefaceStyle.lastCol())) {
            CellRangeAddress cra = new CellRangeAddress(typefaceStyle.firstRow(), typefaceStyle.lastRow(), typefaceStyle.firstCol(), typefaceStyle.lastCol());
            merge += typefaceStyle.lastCol() - typefaceStyle.firstCol();
            //合并的单元格设置边框
            for (int k = typefaceStyle.firstCol() + 1; k <= typefaceStyle.lastCol(); k++) {
                Cell cellFrame = sheetRow.createCell(k);
                PoiData.addData(workbook, cellFrame, null, rowClass, rowField, typefaceStyle);
            }
            sheet.addMergedRegion(cra);
        }
        return merge;
    }

}
