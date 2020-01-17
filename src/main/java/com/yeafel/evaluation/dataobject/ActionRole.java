package com.yeafel.evaluation.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 功能——角色表：（action_role）
 * 用来记录哪些角色具有哪些功能，注意：一个角色可以有多个功能,一个功能也可以对应多个角色。
 * Created by thc on 2019/9/13 16:49
 */
@Entity
@Data
public class ActionRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actionRoleId;

    /** 角色id */
    private Long roleId;

    /** 功能id */
    private Long actionId;

    public Long getActionRoleId() {
        return actionRoleId;
    }

    public void setActionRoleId(Long actionRoleId) {
        this.actionRoleId = actionRoleId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }
}
