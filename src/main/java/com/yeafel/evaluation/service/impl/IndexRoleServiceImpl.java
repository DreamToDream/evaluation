package com.yeafel.evaluation.service.impl;

import com.yeafel.evaluation.dataobject.IndexRole;
import com.yeafel.evaluation.repository.IndexRoleRepository;
import com.yeafel.evaluation.service.IndexRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kangyifan on 2019/10/15 15:14
 */
@Service
@Transactional
public class IndexRoleServiceImpl implements IndexRoleService {

    @Autowired
    private IndexRoleRepository indexRoleRepository;

    @Override
    public List<IndexRole> findIndexRolesByRoleId(Long roleId) {
        List<IndexRole> indexRoleList = indexRoleRepository.findIndexRolesByRoleId(roleId);
        return indexRoleList;
    }

    @Override
    public IndexRole findIndexRoleByIndexId(Long indexId) {
        return indexRoleRepository.findIndexRoleByIndexId(indexId);
    }

    @Override
    public IndexRole save(IndexRole indexRole) {
        return indexRoleRepository.save(indexRole);
    }

    @Override
    public IndexRole updateIndexRole(IndexRole indexRole) {
        IndexRole indexRole1;
        if (indexRole.getIndexId() != null && indexRole.getRoleId() != null){
            /** 
             * 检查这个指标权限存在不
             */
            indexRole1 = indexRoleRepository.findIndexRoleByIndexId(indexRole.getIndexRoleId());
            if (indexRole1 != null){
                indexRole1.setRoleId(indexRole.getRoleId());
                indexRole1.setRoleId(indexRole.getRoleId());
                return indexRoleRepository.save(indexRole1);
            }
            return null;
        }
        return null;
    }


}
