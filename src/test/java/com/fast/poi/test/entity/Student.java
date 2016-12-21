package com.fast.poi.test.entity;

import com.fast.poi.typeface.ForHigh;
import com.fast.poi.typeface.SheetName;
import com.fast.poi.typeface.TypefaceStyle;

/**
 * Created by 杨辽 on 2016/12/4.
 */
@SheetName("班级")
public class Student {

    @ForHigh
    private Row_1 row_1;

    public class Row_1 {

        @TypefaceStyle
        private String no;//学号
        @TypefaceStyle
        private String name;//姓名
        @TypefaceStyle
        private String chinese;//语文
        @TypefaceStyle
        private String mathematics;//数学
        @TypefaceStyle
        private String english;//英语
        @TypefaceStyle
        private String aggregateScore;//总分

        public String getNo() {
            return "学号";
        }

        public String getName() {
            return "姓名";
        }

        public String getChinese() {
            return "语文";
        }

        public String getMathematics() {
            return "数学";
        }

        public String getEnglish() {
            return "英语";
        }

        public String getAggregateScore() {
            return "总分";
        }
    }

    public Row_1 getRow_1() {
        return row_1;
    }

    public Student() {
        this.row_1 = new Row_1();
    }
}
