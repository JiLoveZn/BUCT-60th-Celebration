package com.miniprograms.buct_mini_program.entity;

import java.util.Date;

//预约信息
public class ReservationInformation {
    private String reId;//预约信息编号
    private String name;//姓名
    private Date backTime;//返校时间
    private String backMode;//返校方式

    private Integer groupSize;//团体返校人数
    private Integer classroom;//是否需要教室
    private Integer teacher;//是否需要教师
    private String teacherName;//联系教师姓名
    private String principal;//负责人
    private String principalPhone;//负责人电话

    public String getReId() {
        return reId;
    }

    public void setReId(String reId) {
        this.reId = reId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBackTime() {
        return backTime;
    }

    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    public String getBackMode() {
        return backMode;
    }

    public void setBackMode(String backMode) {
        this.backMode = backMode;
    }

    public Integer getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(Integer groupSize) {
        this.groupSize = groupSize;
    }

    public Integer getClassroom() {
        return classroom;
    }

    public void setClassroom(Integer classroom) {
        this.classroom = classroom;
    }

    public Integer getTeacher() {
        return teacher;
    }

    public void setTeacher(Integer teacher) {
        this.teacher = teacher;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPrincipalPhone() {
        return principalPhone;
    }

    public void setPrincipalPhone(String principalPhone) {
        this.principalPhone = principalPhone;
    }
}
