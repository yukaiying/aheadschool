package com.ahead.school.entity;

import javax.persistence.Column;

public class StudentScoreExcelEntity {

    //班级//属性
    private String studentClass;

    //专业
    private String profession;

    //课程
    private String course;

    //考号
    private String num1;

    //学号
    private String num2;

    //名字
    private String name;

    //性别
    private String sex;

    //平时分
    private Double peacetimeScore;

    //考试成绩
    private Double examScore;

    //最终成绩
    private Double finalScore;

    //学期
    private Integer term;

    //考试科目
    private String examType;

    //任课老师
    private String teacher;

    //所属分院
    private String branch;
     //构造器
    public StudentScoreExcelEntity() {
    }
    //构造器的重写
    public StudentScoreExcelEntity(String studentClass, String profession, String course, String num1, String num2, String name, String sex, Double peacetimeScore, Double examScore, Double finalScore, Integer term, String examType, String teacher, String branch) {
        this.studentClass = studentClass;
        this.profession = profession;
        this.course = course;
        this.num1 = num1;
        this.num2 = num2;
        this.name = name;
        this.sex = sex;
        this.peacetimeScore = peacetimeScore;
        this.examScore = examScore;
        this.finalScore = finalScore;
        this.term = term;
        this.examType = examType;
        this.teacher = teacher;
        this.branch = branch;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) { this.studentClass = studentClass; }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getPeacetimeScore() {
        return peacetimeScore;
    }

    public void setPeacetimeScore(Double peacetimeScore) {
        this.peacetimeScore = peacetimeScore;
    }

    public Double getExamScore() {
        return examScore;
    }

    public void setExamScore(Double examScore) {
        this.examScore = examScore;
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
