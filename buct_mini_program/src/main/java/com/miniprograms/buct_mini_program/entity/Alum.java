package com.miniprograms.buct_mini_program.entity;

public class Alum { //校友

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getAlumName() {
        return alumName;
    }

    public void setAlumName(String alumName) {
        this.alumName = alumName;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    private String wxId; //微信Id
    private String alumName; //姓名
    private Integer startYear; //入学年份
    private String department; //院系
    private String classNo; //class number, 班级
    private String photoUrl; //照片的存储路径url
}
