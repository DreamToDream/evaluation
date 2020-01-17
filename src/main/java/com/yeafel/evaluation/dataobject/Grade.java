package com.yeafel.evaluation.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 评教成绩表
 * Created by thc on 2019/9/13 11:46
 */
@Entity
@Data
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gradeId;

    /** 教师编号 */
    private Long teacherId;

    /** 课程id. */
    private Long courseId;

    /** 学生打分（平均分.*/
    private BigDecimal studentScore;

    /**  老师打分（平均分）. */
    private BigDecimal teacherScore;

    /** 教研室打分（平均分）.*/
    private BigDecimal researchScore;

    /** 系部打分（平均分）. */
    private BigDecimal departmentScore;

    /** 老师所得总分数（平均分）. */
    private BigDecimal totalScore;

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
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

    public BigDecimal getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(BigDecimal studentScore) {
        this.studentScore = studentScore;
    }

    public BigDecimal getTeacherScore() {
        return teacherScore;
    }

    public void setTeacherScore(BigDecimal teacherScore) {
        this.teacherScore = teacherScore;
    }

    public BigDecimal getResearchScore() {
        return researchScore;
    }

    public void setResearchScore(BigDecimal researchScore) {
        this.researchScore = researchScore;
    }

    public BigDecimal getDepartmentScore() {
        return departmentScore;
    }

    public void setDepartmentScore(BigDecimal departmentScore) {
        this.departmentScore = departmentScore;
    }

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }
}
