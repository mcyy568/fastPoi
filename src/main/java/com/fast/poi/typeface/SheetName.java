package com.fast.poi.typeface;

import org.apache.poi.ss.formula.functions.T;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 创建用户：杨辽
 * 创建时间：2016-12-03 08:50:00
 * 描    述：sheet页名称
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SheetName {

    String value();

}
