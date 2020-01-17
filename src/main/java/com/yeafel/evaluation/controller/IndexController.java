package com.yeafel.evaluation.controller;

import com.yeafel.evaluation.dataobject.IndexRole;
import com.yeafel.evaluation.dataobject.Role;
import com.yeafel.evaluation.service.IndexRoleService;
import com.yeafel.evaluation.vo.ResultVO;
import com.yeafel.evaluation.dto.IndexDTO;
import com.yeafel.evaluation.enums.ResultEnum;
import com.yeafel.evaluation.exception.EvaluationException;
import com.yeafel.evaluation.service.IndexService;
import com.yeafel.evaluation.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * Created by thc on 2019/10/8 9:43
 */
@RestController
@RequestMapping("/index")
@Slf4j
public class IndexController  {


    @Autowired
    private IndexService indexService;
    @Autowired
    private IndexRoleService indexRoleService;

    @GetMapping("/list")
    public ResultVO<IndexDTO> list(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                   @RequestParam(value = "limit",defaultValue = "10") Integer limit,
                                   IndexDTO indexDTO) throws UnsupportedEncodingException {
        Integer count = indexService.countIndexForPage(indexDTO.getIndexName());

        /** 此处代码作用：  从前端传回来的course值会乱码，在这里处理掉乱码问题.*/
        if (indexDTO.getIndexName() != null) {
            String fname =  URLDecoder.decode(indexDTO.getIndexName() , "utf-8");
            indexDTO.setIndexName(fname);
        }

        PageRequest request = PageRequest.of(page-1,limit);
        Page<IndexDTO> indexDTOPage = indexService.findIndexIfIndexNameIsNotNull(indexDTO.getIndexName(),request);
//        response.addHeader("Access-Control-Allow-Origin", "*");   使用nginx需要加
        return ResultVOUtil.success(indexDTOPage.getContent(),count);


    }


    /**
     * 不分页查询，为了指标树形展开而制定的方法。
     * @param indexDTO
     * @return
     * @throws UnsupportedEncodingException
     */
    @GetMapping("/listNotPage")
    public ResultVO<List<IndexDTO>> list(IndexDTO indexDTO) throws UnsupportedEncodingException {
        Integer count = indexService.countIndexForPage(indexDTO.getIndexName());

        /** 此处代码作用：  从前端传回来的course值会乱码，在这里处理掉乱码问题.*/
        if (indexDTO.getIndexName() != null) {
            String fname =  URLDecoder.decode(indexDTO.getIndexName() , "utf-8");
            indexDTO.setIndexName(fname);
        }

        PageRequest request = PageRequest.of(0,9999);       //为了不分页查出所有数据。
        Page<IndexDTO> indexDTOPage = indexService.findIndexIfIndexNameIsNotNull(indexDTO.getIndexName(),request);
        /** 
         * 全体指标不显示所属角色
         * 不然改动太多
         */
//        List<IndexDTO> indexDTOList = new ArrayList<>(indexDTOPage.getContent());
//        indexDTOList.forEach(indexDTO1 -> {
//            if (indexDTO.getParentId() == 0){
//                /**
//                 * 在这里查询一个和其id匹配的角色
//                 */
//                indexDTO.setRole(null);
//            }
//        });
//        response.addHeader("Access-Control-Allow-Origin", "*");   使用nginx需要加
        return ResultVOUtil.success(indexDTOPage.getContent(),count);


    }





    @GetMapping("/findByIndexId")
    public ResultVO<IndexDTO> findByIndexId(Long indexId){
        IndexDTO indexDTO = indexService.findByIndexId(indexId);
        /** 
         * 查出这个指标对应的角色
         * 将其角色id和角色名字add进去(名字大概不需要)
         */
        IndexRole indexRole = indexRoleService.findIndexRoleByIndexId(indexId);
        if (indexRole != null) {
            indexDTO.setRoleId(indexRole.getRoleId());
        }
        return ResultVOUtil.success(indexDTO);
    }



    /** 
     * 保存请求随便保存权限
     */
    //保存用户，编辑与新增公用
    @PostMapping("/save")
    public ResultVO<Null> save(IndexDTO indexDTO){
        if(indexDTO.getIsEffective() == null){    //layui的switch的监听，如果没有被选中，会默认传null
            indexDTO.setIsEffective(0);
        }
        //更改
        if (indexDTO != null && indexDTO.getIndexId() != null){
            IndexDTO updateResult = indexService.updateIndex(indexDTO);
            /** 
             * 更新角色权限
             * 这里复制bean应该用 BeanUtils.copyProperties() 但是懒得改了
             */
            IndexRole indexRole = new IndexRole();
            indexRole.setIndexId(updateResult.getIndexId());
            indexRole.setRoleId(indexDTO.getRoleId());
            indexRoleService.updateIndexRole(indexRole);

            if (updateResult == null){
                throw new EvaluationException(ResultEnum.UPDATE_ERROR);
            }
        }else {
            //新增
            /**
             * new 一个当前时间作为新的指标的创建时间
             * 这里复制bean应该用 BeanUtils.copyProperties() 但是懒得改了
             */
            indexDTO.setCreateTime(new Date());
            IndexDTO createResult = indexService.create(indexDTO);
            
            /** 
             * 创建角色权限
             */
            IndexRole indexRole = new IndexRole();
            indexRole.setIndexId(createResult.getIndexId());
            indexRole.setRoleId(indexDTO.getRoleId());
            indexRoleService.save(indexRole);

            if (createResult == null){
                throw new EvaluationException(ResultEnum.CREATE_ERROR);
            }
        }

        return ResultVOUtil.success();

    }




    @PostMapping("/delete")
    public ResultVO<Null> delete(String delitems,Long id){
        if (delitems != null) {     /*判断时单行删除还是批量删除*/
            String[] strs = delitems.split(",");
            for (int i = 0; i < strs.length; i++) {
                Long a = Long.parseLong(strs[i]);
                indexService.deleteByIndexId(a);
            }
        } else {
            indexService.deleteByIndexId(id);
        }
        return ResultVOUtil.success();
    }
}
