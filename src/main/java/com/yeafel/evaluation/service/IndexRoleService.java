package com.yeafel.evaluation.service;

import com.yeafel.evaluation.dataobject.IndexRole;

import java.util.List;

/**
 *  指标--角色表
 * Created by thc on 2019/10/15 15:13
 */
public interface IndexRoleService {

    List<IndexRole> findIndexRolesByRoleId(Long roleId);

    IndexRole findIndexRoleByIndexId(Long indexId);

    IndexRole save(IndexRole indexRole);

    IndexRole updateIndexRole(IndexRole indexRole);
}
