package com.ayout.item.service;

import com.ayout.item.mapper.SpecGroupMapper;
import com.ayout.item.mapper.SpecParamMapper;
import com.ayout.item.pojo.SpecGroup;
import com.ayout.item.pojo.SpecParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecificationService {

    @Autowired
    private SpecGroupMapper groupMapper;

    /**
     * 根据分类id查询分组
     * @param cid
     * @return
     */
    public List<SpecGroup> queryGroupsByCid(Long cid) {
        SpecGroup specGroup = new SpecGroup();
        specGroup.setCid(cid);
        return this.groupMapper.select(specGroup);
    }


    @Autowired
    private SpecParamMapper specParamMapper;

    /**
     * 根据条件查询规格参数
     * @param gid
     * @returnb
     */
    /**
     * 根据gid查询规格参数
     * @param gid
     * @return
     */
    public List<SpecParam> queryParams(Long gid, Long cid, Boolean generic, Boolean searching) {
        SpecParam record = new SpecParam();
        record.setGroupId(gid);
        record.setCid(cid);
        record.setGeneric(generic);
        record.setSearching(searching);
        return this.specParamMapper.select(record);
    }



}
