package com.fast.poi.test;

import com.fast.poi.test.entity.SchoolData;
import com.fast.poi.test.entity.StudentData;

import java.util.*;

/**
 * Created by 杨辽 on 2016/12/4.
 */
public class AddData {

    public static List<StudentData> getStudentDataObject() {
        return Arrays.asList(
                new StudentData("121", "每逢", "85", "55", "33", ""),
                new StudentData("122", "不论", "32", "11", "65", ""),
                new StudentData("123", "作为", "12", "65", "23", ""),
                new StudentData("124", "绩统", "33", "43", "44", ""),
                new StudentData("125", "的本", "44", "65", "11", ""),
                new StudentData("126", "成绩", "78", "54", "12", ""),
                new StudentData("127", "时代", "87", "66", "76", ""),
                new StudentData("128", "关心", "98", "77", "43", ""),
                new StudentData("127", "就的", "83", "66", "76", ""),
                new StudentData("128", "个啊", "92", "77", "43", ""));
    }


    public static List<LinkedHashMap<String, String>> getStudentDataMap() {
        List<LinkedHashMap<String, String>> datas = new ArrayList<LinkedHashMap<String, String>>();

        Map<String, String> map_1 = new LinkedHashMap<String, String>();
        map_1.put("学号", "123");
        map_1.put("姓名", "123");
        map_1.put("语文", "123");
        map_1.put("数学", "123");
        map_1.put("英语", "123");
        map_1.put("总分", "123");
        Map<String, String> map_2 = new LinkedHashMap<String, String>();
        map_2.put("学号", "223");
        map_2.put("姓名", "223");
        map_2.put("语文", "223");
        map_2.put("数学", "223");
        map_2.put("英语", "223");
        map_2.put("总分", "223");
        Map<String, String> map_3 = new LinkedHashMap<String, String>();
        map_3.put("学号", "334");
        map_3.put("姓名", "334");
        map_3.put("语文", "334");
        map_3.put("数学", "334");
        map_3.put("英语", "334");
        map_3.put("总分", "334");

        datas.add((LinkedHashMap<String, String>) map_1);
        datas.add((LinkedHashMap<String, String>) map_2);
        datas.add((LinkedHashMap<String, String>) map_3);
        return datas;
    }

    public static List<SchoolData> getSchoolDataObject() {
        return Arrays.asList(
                new SchoolData("121", "每逢", "32", "55", "33", "5", "f", "ew", "asd", "zxc", "jh", "啊阿萨", "在", "这些", "请问"),
                new SchoolData("121", "每逢", "85", "55", "33", "5", "f", "ew", "asd", "zxc", "jh", "啊阿萨", "在", "这些", "请问"),
                new SchoolData("121", "每逢", "85", "55", "33", "5", "f", "ew", "asd", "zxc", "jh", "啊阿萨", "在", "这些", "请问"),
                new SchoolData("121", "每逢", "85", "55", "33", "5", "f", "ew", "asd", "zxc", "jh", "啊阿萨", "在", "这些", "请问"),
                new SchoolData("121", "每逢", "85", "55", "33", "5", "f", "ew", "asd", "zxc", "jh", "啊阿萨", "在", "这些", "请问"),
                new SchoolData("121", "每逢", "85", "55", "33", "5", "f", "ew", "asd", "zxc", "jh", "啊阿萨", "在", "这些", "请问"),
                new SchoolData("121", "每逢", "85", "55", "33", "5", "f", "ew", "asd", "zxc", "jh", "啊阿萨", "在", "这些", "请问"),
                new SchoolData("121", "每逢", "85", "55", "33", "5", "f", "ew", "asd", "zxc", "jh", "啊阿萨", "在", "这些", "请问"),
                new SchoolData("121", "每逢", "85", "55", "33", "5", "f", "ew", "asd", "zxc", "jh", "啊阿萨", "在", "这些", "请问"),
                new SchoolData("121", "每逢", "85", "55", "33", "5", "f", "ew", "asd", "zxc", "jh", "啊阿萨", "在", "这些", "请问"));
    }


    public static List<LinkedHashMap<String, String>> getSchoolDataMap(){
        List<LinkedHashMap<String, String>> datas = new ArrayList<LinkedHashMap<String, String>>();
        Map<String, String> map_1 = new LinkedHashMap<String, String>();
        map_1.put("高一1", "123");
        map_1.put("高一2", "123");
        map_1.put("高一3", "123");
        map_1.put("高一4", "123");
        map_1.put("高一5", "123");
        map_1.put("高二1", "123");
        map_1.put("高二2", "123");
        map_1.put("高二3", "123");
        map_1.put("高二4", "123");
        map_1.put("高三1", "123");
        map_1.put("高三2", "123");
        map_1.put("高三3", "123");
        map_1.put("高三4", "123");
        map_1.put("高三5", "123");
        map_1.put("高三6", "123");
        Map<String, String> map_2 = new LinkedHashMap<String, String>();
        map_2.put("高一1", "123");
        map_2.put("高一2", "123");
        map_2.put("高一3", "123");
        map_2.put("高一4", "123");
        map_2.put("高一5", "123");
        map_2.put("高二1", "123");
        map_2.put("高二2", "123");
        map_2.put("高二3", "123");
        map_2.put("高二4", "123");
        map_2.put("高三1", "123");
        map_2.put("高三2", "123");
        map_2.put("高三3", "123");
        map_2.put("高三4", "123");
        map_2.put("高三5", "123");
        map_2.put("高三6", "123");
        Map<String, String> map_3 = new LinkedHashMap<String, String>();
        map_3.put("高一1", "123");
        map_3.put("高一2", "123");
        map_3.put("高一3", "123");
        map_3.put("高一4", "123");
        map_3.put("高一5", "123");
        map_3.put("高二1", "123");
        map_3.put("高二2", "123");
        map_3.put("高二3", "123");
        map_3.put("高二4", "123");
        map_3.put("高三1", "123");
        map_3.put("高三2", "123");
        map_3.put("高三3", "123");
        map_3.put("高三4", "123");
        map_3.put("高三5", "123");
        map_3.put("高三6", "123");
        datas.add((LinkedHashMap<String, String>) map_1);
        datas.add((LinkedHashMap<String, String>) map_2);
        datas.add((LinkedHashMap<String, String>) map_3);
        return datas;
    }

}
