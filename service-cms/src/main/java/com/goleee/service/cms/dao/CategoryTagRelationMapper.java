package com.goleee.service.cms.dao;

import com.goleee.service.cms.entity.po.CategoryTagRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CategoryTagRelationMapper extends BaseMapper<CategoryTagRelation> {

}
