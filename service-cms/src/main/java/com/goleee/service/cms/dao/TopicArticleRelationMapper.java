package com.goleee.service.cms.dao;

import com.goleee.service.cms.entity.po.TopicArticleRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TopicArticleRelationMapper extends BaseMapper<TopicArticleRelation> {

}
