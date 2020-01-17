package com.yeafel.evaluation.dataobject;

import com.yeafel.evaluation.enums.RoleEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 角色表：(Role)
 * 注意：角色的定义是为了给用户赋予权限，这里要跟用户的身份严格区分开来，一个用户只能有一个身份
 * Created by thc on 2019/9/13 11:23
 */

@Data
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    /** 角色名 */
    private String roleName;    //默认为学生

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
}
