package com.fast.poi.test;


import com.fast.poi.excelModel.IXSSFWorkbook;
import com.fast.poi.test.entity.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/**
 * Created by 杨辽 on 2016/12/3.
 */
public class TestFastPoi {

    private static String excelPath = "D://test/";

    /**
     * 生成一个简单的Excel
     *
     * @throws Exception
     */
    @Test
    public void testStudentExcelObject() throws Exception {

        Student student = new Student();
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = IXSSFWorkbook.NewSheet(workbook, student);
        List<StudentData> datas = AddData.getStudentDataObject();
        int j = 1;
        for (int i = 0; i < 1; i++) {
            System.out.println(i);
            IXSSFWorkbook.addSheetData(workbook, sheet, datas, j);
            j += 10;
        }
        newFile(workbook);
    }

    /**
     * 生成一个简单的Excel
     *
     * @throws Exception
     */
    @Test
    public void testStudentExcelMap() throws Exception {

        Student student = new Student();
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = IXSSFWorkbook.NewSheet(workbook, student);
        List<LinkedHashMap<String, String>> datas = AddData.getStudentDataMap();
        int j = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            IXSSFWorkbook.addSheetData(workbook, sheet, datas, j);
            j += 3;
        }
        newFile(workbook);
    }


    /**
     * 比较复杂的Excel
     *
     * @throws Exception
     */
    @Test
    public void testSchoolExcelObject() throws Exception {
        School school = new School("某某学校", "2015年11月3日");
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = IXSSFWorkbook.NewSheet(workbook, school);

        List<SchoolData> datas = AddData.getSchoolDataObject();
        int j = 4;
        for (int i = 0; i < 1; i++) {
            System.out.println(i);
            IXSSFWorkbook.addSheetData(workbook, sheet, datas, j);
            j += 10;
        }

        newFile(workbook);
    }


    /**
     * 比较复杂的Excel
     *
     * @throws Exception
     */
    @Test
    public void testSchoolExcelMap() throws Exception {
        School school = new School("某某学校", "2015年11月3日");
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = IXSSFWorkbook.NewSheet(workbook, school);

        List<LinkedHashMap<String, String>> datas = AddData.getSchoolDataMap();
        int j = 4;
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            IXSSFWorkbook.addSheetData(workbook, sheet, datas, j);
            j += 3;
        }

        newFile(workbook);
    }

    private static void newFile(Workbook workbook) throws Exception {

        File file = new File(excelPath);
        if (!file.exists() && !file.isDirectory()) {
            file.mkdirs();
        }

        FileOutputStream outputStream = new FileOutputStream(excelPath + UUID.randomUUID() + ".xlsx");
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
    }

}
