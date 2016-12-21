package com.fast.poi.test.entity;

/**
 * Created by 杨辽 on 2016/12/4.
 */
public class StudentData {

    private String no;//学号
    private String name;//姓名
    private String chinese;//语文
    private String mathematics;//数学
    private String english;//英语
    private String aggregateScore;//总分

    public StudentData(String no, String name, String chinese, String mathematics, String english, String aggregateScore) {
        this.no = no;
        this.name = name;
        this.chinese = chinese;
        this.mathematics = mathematics;
        this.english = english;
        this.aggregateScore = (Integer.valueOf(chinese) + Integer.valueOf(mathematics) + Integer.valueOf(english)) + "";
    }

    public String getNo() {

        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getMathematics() {
        return mathematics;
    }

    public void setMathematics(String mathematics) {
        this.mathematics = mathematics;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getAggregateScore() {
        return aggregateScore;
    }

    public void setAggregateScore(String aggregateScore) {
        this.aggregateScore = aggregateScore;
    }
}
