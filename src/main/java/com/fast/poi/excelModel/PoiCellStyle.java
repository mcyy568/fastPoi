package com.fast.poi.excelModel;

import com.fast.poi.typeface.TypefaceStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * 创建用户：杨辽
 * 创建时间：2016-12-03 09:40:00
 * 描    述：获取样式
 */
public class PoiCellStyle {

    //生成每个单元格设置的样式
    static CellStyle addCellStyle(Workbook workbook, TypefaceStyle typefaceStyle){
        CellStyle style = workbook.createCellStyle();

        //对齐方式
        style.setAlignment(typefaceStyle.alignment());
        style.setVerticalAlignment(typefaceStyle.verticalAlignment());

        // 设置单元格字体
        Font headerFont = workbook.createFont(); // 字体
        headerFont.setFontHeightInPoints(typefaceStyle.fontHeightInPoints());
        headerFont.setColor(typefaceStyle.fontColor());
        headerFont.setFontName(typefaceStyle.fontName());
        style.setFont(headerFont);

        //自动换行
        style.setWrapText(typefaceStyle.wrapText());

        // 设置单元格边框及颜色
        style.setBorderBottom(typefaceStyle.borderBottom());
        style.setBorderLeft(typefaceStyle.borderLeft());
        style.setBorderRight(typefaceStyle.borderRight());
        style.setBorderTop(typefaceStyle.borderTop());

        //设置背景颜色
        style.setFillForegroundColor(typefaceStyle.backgroundColor());
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);
        return style;
    }
}
