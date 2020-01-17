package com.yeafel.evaluation.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 指标——角色表(index_role)
 * Created by thc on 2019/9/13 16:43
 */
@Entity
@Data
public class IndexRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long indexRoleId;

    /** 指标id */
    private Long indexId;

    /** 角色id */
    private Long roleId;

    public Long getIndexRoleId() {
        return indexRoleId;
    }

    public void setIndexRoleId(Long indexRoleId) {
        this.indexRoleId = indexRoleId;
    }

    public Long getIndexId() {
        return indexId;
    }

    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
