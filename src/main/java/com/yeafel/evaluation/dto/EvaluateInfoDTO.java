package com.yeafel.evaluation.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 *  评教记录
 * Created by thc on 2019/10/16 14:35
 */
@Data
public class EvaluateInfoDTO {

    private Long evaluateInfoId;

    /**  评价人(对应用户表的user_id). */
    private Long evaluatorId;

    /** 评价方角色 .*/
    private Long roleId;

    /** 评价方角色 .*/
    private String roleName;

    /** 教师Id(对应用户表的user_id). */
    private Long teacherId;

    /** 评价的课程id .*/
    private Long courseId;

    /** 评分数.*/
    private BigDecimal score;

    /** 评价人姓名. */
    private String evaluatorName;

    /** 教师姓名 .*/
    private String teacherName;


    /** 课程名. */
    private String courseName;

    public Long getEvaluateInfoId() {
        return evaluateInfoId;
    }

    public void setEvaluateInfoId(Long evaluateInfoId) {
        this.evaluateInfoId = evaluateInfoId;
    }

    public Long getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(Long evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getEvaluatorName() {
        return evaluatorName;
    }

    public void setEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
