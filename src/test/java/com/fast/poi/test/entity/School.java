package com.fast.poi.test.entity;

import com.fast.poi.typeface.ForHigh;
import com.fast.poi.typeface.SheetName;
import com.fast.poi.typeface.TypefaceStyle;

/**
 * Created by 杨辽 on 2016/12/4.
 */
@SheetName("学校班级人数统计")
public class School {

    @ForHigh(1000)
    private Row_1 row_1;
    private Row_2 row_2;
    private Row_3 row_3;
    private Row_4 row_4;

    public class Row_1 {
        @TypefaceStyle(firstRow = 0, lastRow = 0, firstCol = 0, lastCol = 14, fontHeightInPoints = 20)
        String name;//学校名称

        public String getName() {
            return name;
        }

        public Row_1(String name) {
            this.name = name;
        }
    }

    public class Row_2 {
        @TypefaceStyle(firstRow = 1, lastRow = 1, firstCol = 0, lastCol = 14, alignment = 3)
        private String newDate;//文件创建时间

        public String getNewDate() {
            return newDate;
        }

        public Row_2(String newDate) {
            this.newDate = newDate;
        }
    }


    public class Row_3 {
        @TypefaceStyle(firstRow = 2, lastRow = 2, firstCol = 0, lastCol = 4, backgroundColor = 10)
        private String grade_1;//高一
        @TypefaceStyle(firstRow = 2, lastRow = 2, firstCol = 5, lastCol = 8, backgroundColor = 11)
        private String grade_2;//高二
        @TypefaceStyle(firstRow = 2, lastRow = 2, firstCol = 9, lastCol = 14, backgroundColor = 13)
        private String grade_3;//高三

        public String getGrade_1() {
            return "高一";
        }

        public String getGrade_2() {
            return "高二";
        }

        public String getGrade_3() {
            return "高三";
        }
    }


    public class Row_4 {
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 10)
        private String grade_1_class_1;//高一
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 10)
        private String grade_1_class_2;//高一
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 10)
        private String grade_1_class_3;//高一
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 10)
        private String grade_1_class_4;//高一
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 10)
        private String grade_1_class_5;//高一

        @TypefaceStyle(columnWidth = 3000, backgroundColor = 11)
        private String grade_2_class_1;//高二
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 11)
        private String grade_2_class_2;//高二
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 11)
        private String grade_2_class_3;//高二
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 11)
        private String grade_2_class_4;//高二

        @TypefaceStyle(columnWidth = 3000, backgroundColor = 13)
        private String grade_3_class_1;//高三
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 13)
        private String grade_3_class_2;//高三
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 13)
        private String grade_3_class_3;//高三
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 13)
        private String grade_3_class_4;//高三
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 13)
        private String grade_3_class_5;//高三
        @TypefaceStyle(columnWidth = 3000, backgroundColor = 13)
        private String grade_3_class_6;//高三

        public String getGrade_1_class_1() {
            return "一班";
        }

        public String getGrade_1_class_2() {
            return "二班";
        }

        public String getGrade_1_class_3() {
            return "三班";
        }

        public String getGrade_1_class_4() {
            return "四班";
        }

        public String getGrade_1_class_5() {
            return "五班";
        }

        public String getGrade_2_class_1() {
            return "一班";
        }

        public String getGrade_2_class_2() {
            return "二班";
        }

        public String getGrade_2_class_3() {
            return "三班";
        }

        public String getGrade_2_class_4() {
            return "四班";
        }

        public String getGrade_3_class_1() {
            return "一班";
        }

        public String getGrade_3_class_2() {
            return "二班";
        }

        public String getGrade_3_class_3() {
            return "三班";
        }

        public String getGrade_3_class_4() {
            return "四班";
        }

        public String getGrade_3_class_5() {
            return "五班";
        }

        public String getGrade_3_class_6() {
            return "六班";
        }
    }

    public Row_1 getRow_1() {
        return row_1;
    }

    public Row_2 getRow_2() {
        return row_2;
    }

    public Row_3 getRow_3() {
        return row_3;
    }

    public Row_4 getRow_4() {
        return row_4;
    }

    public School(String schoolName, String newDate) {
        this.row_1 = new Row_1(schoolName);
        this.row_2 = new Row_2(newDate);
        this.row_3 = new Row_3();
        this.row_4 = new Row_4();
    }
}
