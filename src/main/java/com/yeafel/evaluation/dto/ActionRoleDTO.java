package com.yeafel.evaluation.dto;

import com.yeafel.evaluation.dataobject.ActionRole;
import lombok.Data;

import java.util.List;

/**
 * Created by thc on 2019/9/30 12:02
 */

@Data
public class ActionRoleDTO {

    private Long actionRoleId;

    /** 角色id */
    private Long roleId;

    /** 功能id */
    private Long actionId;


    /** 角色名称 .*/
    private String roleName;


    /** 功能名数组，用来装某一个用户的所有功能. */
    List<String> actionNames;


    private List<Long> actionIds;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<String> getActionNames() {
        return actionNames;
    }

    public void setActionNames(List<String> actionNames) {
        this.actionNames = actionNames;
    }

    public List<Long> getActionIds() {
        return actionIds;
    }

    public void setActionIds(List<Long> actionIds) {
        this.actionIds = actionIds;
    }
}
