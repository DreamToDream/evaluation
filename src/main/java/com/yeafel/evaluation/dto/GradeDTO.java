package com.yeafel.evaluation.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 *    老师的评教成绩
 * Created by thc on 2019/10/18 20:54
 */
@Data
public class GradeDTO {

    private Long gradeId;

    /** 教师编号 */
    private Long teacherId;

    private String teacherName;

    /** 课程id. */
    private Long courseId;

    private String courseName;

    /** 学生打分（平均分.*/
    private BigDecimal studentScore = new BigDecimal(0);        //默认值为0

    /**  老师打分（平均分）. */
    private BigDecimal teacherScore = new BigDecimal(0);        //默认值为0

    /** 教研室打分（平均分）.*/
    private BigDecimal researchScore = new BigDecimal(0);        //默认值为0

    /** 系部打分（平均分）. */
    private BigDecimal departmentScore = new BigDecimal(0);        //默认值为0

    /** 老师所得总分数（平均分）. */
    private BigDecimal totalScore = new BigDecimal(0);        //默认值为0

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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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
