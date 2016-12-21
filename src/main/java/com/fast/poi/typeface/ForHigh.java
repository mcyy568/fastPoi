package com.fast.poi.typeface;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建用户：杨辽
 * 创建时间：2016-12-03 13:04:00
 * 描    述：设置行高
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ForHigh {

    /**
     * 设置每一行的行高，默认为-1不设置高度
     * 单位像素
     */
    int value() default -1;

}
