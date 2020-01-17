package com.yeafel.evaluation.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * EvaluateInfoService  （用来记录某个用户给某个老师的某门课程打了多少分）
 * 评分信息表
 * Created by thc on 2019/9/13 11:29
 */
@Entity
@Data
public class EvaluateInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long evaluateInfoId;

    /**  评价人(对应用户表的user_id). */
    private Long evaluatorId;

    /** 评价方角色 .*/
    private Long roleId;

    /** 教师id(对应用户表的user_id). */
    private Long teacherId;

    /** 评价的课程 .*/
    private Long courseId;

    /** 评分数.*/
    private BigDecimal score;

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
}
