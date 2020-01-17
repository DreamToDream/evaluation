package com.yeafel.evaluation.dto;

import lombok.Data;

/**
 * Created by thc on 2019/10/10 10:35
 */
@Data
public class LectureDTO {

    private Long lectureId;         //授课id

    /** 老师 .*/
    private Long teacherId;    //老师的id，解法有多种，可以从用户表里动态加载班级为0的用户（班级为0代表老师）

    private String teacherNo;

    private String teacherName;


    /** 授课班级 .*/
    private Long clazzId;      //班级id

    private String clazzNo;


    /** 上什么课 .*/
    private Long courseId;      //课程id

    private String courseName;

    /** 老师属于哪个院系. */
    private Long departmentId;  //院系id

    private String departmentName;

    /** 学期id .*/
    private Long semesterId;   //学期id

    private String semesterName;   //学期id


    private Long isOpen;    //是否能够评教,0(不能)   1(能)

    private Long isMatch;       //是否匹配？ 0(不匹配)  1(匹配)

    public Long getLectureId() {
        return lectureId;
    }

    public void setLectureId(Long lectureId) {
        this.lectureId = lectureId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Long getClazzId() {
        return clazzId;
    }

    public void setClazzId(Long clazzId) {
        this.clazzId = clazzId;
    }

    public String getClazzNo() {
        return clazzNo;
    }

    public void setClazzNo(String clazzNo) {
        this.clazzNo = clazzNo;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Long semesterId) {
        this.semesterId = semesterId;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public Long getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Long isOpen) {
        this.isOpen = isOpen;
    }

    public Long getIsMatch() {
        return isMatch;
    }

    public void setIsMatch(Long isMatch) {
        this.isMatch = isMatch;
    }
}
