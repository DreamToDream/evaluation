package com.yeafel.evaluation.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by thc on 2019/9/13 10:44
 */
@Entity
@Data
public class Clazz {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clazzId;

    /** 班级名称 */
    private String clazzName;

    /** 班级编号. */
    private String clazzNo;

    public Long getClazzId() {
        return clazzId;
    }

    public void setClazzId(Long clazzId) {
        this.clazzId = clazzId;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public String getClazzNo() {
        return clazzNo;
    }

    public void setClazzNo(String clazzNo) {
        this.clazzNo = clazzNo;
    }
}
