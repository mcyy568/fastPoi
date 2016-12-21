package com.fast.poi.typeface;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建用户：杨辽
 * 创建时间：2016-12-03 08:56:00
 * 描    述：设置字体样式
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TypefaceStyle {

    /**
     * 设置列宽 默认为 -1 不设置
     * 单位像素
     */
    int columnWidth() default -1;

    /**
     * 设置字体大小 默认 10
     */
    short fontHeightInPoints() default 10;

    /**
     * 设置字体颜色  默认黑色
     * HSSFColor.BLACK.index
     *
     */
    short fontColor() default 8;

    /**
     * 设置字体背景颜色  默认白色
     *     BLACK(8),
     *     WHITE(9),
     *     RED(10),
     *     BRIGHT_GREEN(11),
     *     BLUE(12),
     *     YELLOW(13),
     *     PINK(14),
     *     TURQUOISE(15),
     *     DARK_RED(16),
     *     GREEN(17),
     *     DARK_BLUE(18),
     *     DARK_YELLOW(19),
     *     VIOLET(20),
     *     TEAL(21),
     *     GREY_25_PERCENT(22),
     *     GREY_50_PERCENT(23),
     *     CORNFLOWER_BLUE(24),
     *     MAROON(25),
     *     LEMON_CHIFFON(26),
     *     ORCHID(28),
     *     CORAL(29),
     *     ROYAL_BLUE(30),
     *     LIGHT_CORNFLOWER_BLUE(31),
     *     SKY_BLUE(40),
     *     LIGHT_TURQUOISE(41),
     *     LIGHT_GREEN(42),
     *     LIGHT_YELLOW(43),
     *     PALE_BLUE(44),
     *     ROSE(45),
     *     LAVENDER(46),
     *     TAN(47),
     *     LIGHT_BLUE(48),
     *     AQUA(49),
     *     LIME(50),
     *     GOLD(51),
     *     LIGHT_ORANGE(52),
     *     ORANGE(53),
     *     BLUE_GREY(54),
     *     GREY_40_PERCENT(55),
     *     DARK_TEAL(56),
     *     SEA_GREEN(57),
     *     DARK_GREEN(58),
     *     OLIVE_GREEN(59),
     *     BROWN(60),
     *     PLUM(61),
     *     INDIGO(62),
     *     GREY_80_PERCENT(63),
     *     AUTOMATIC(64);
     */
    short backgroundColor() default 9;

    /**
     * 字体样式 默认 宋体
     */
    String fontName() default "宋体";

    /**
     * 自动换行 默认 false
     */
    boolean wrapText() default false;

    /**
     * 设置对齐
     * 居左 = 1;
     * 居中 = 2;
     * 居右 = 3;
     */
    short alignment() default 2;

    /**
     * 设置垂直对齐
     * 垂直居中 = 1;
     * 底 = 2;
     * 上 = 0;
     */
    short verticalAlignment() default 1;

    /**
     * 边框 默认 1
     */
    short borderBottom() default 1;
    short borderLeft() default 1;
    short borderRight() default 1;
    short borderTop() default 1;


    /**
     * 设置合并单元格 默认为-1 不合并
     * 注意:这4个属性必须同时设置
     * 只支持单行合并,必须 firstRow==lastRow////当前行
     */
    int firstRow() default -1;
    int lastRow() default -1;
    int firstCol() default -1;
    int lastCol() default -1;


}
