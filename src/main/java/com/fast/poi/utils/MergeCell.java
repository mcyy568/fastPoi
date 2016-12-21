package com.fast.poi.utils;

/**
 * 创建用户：杨辽
 * 创建时间：2016-12-03 13:43:00
 * 描    述：单元格
 */
public class MergeCell {

    /**
     * 判断是否合并单元格
     */
    public static boolean WhetherToMerge(int firstRow, int lastRow, int firstCol, int lastCol) {
        return firstRow != -1 && lastRow != -1 && firstCol != -1 && lastCol != -1;
    }

}
