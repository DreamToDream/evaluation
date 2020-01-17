package com.yeafel.evaluation.vo;

import lombok.Data;

import java.io.Serializable;

/**
 *  用户信息
 * Created by thc on 2019/9/13 15:27
 */
@Data
public class UserVO implements Serializable {

    private static final long serialVersionUID = 8581889082850103196L;

    private Integer id;

    /**  人员编号. */
    private String number;

    /**  密码. */
    private String password;

    /** 身份. */
    private String identity;

    /** 姓名. */
    private String name;

    /** 院系编号. */
    private String departmentNo;

    /** 班级编号. */
    private String clazzNo;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getClazzNo() {
        return clazzNo;
    }

    public void setClazzNo(String clazzNo) {
        this.clazzNo = clazzNo;
    }
}
