package com.goleee.service.cms.dao;

import com.goleee.service.cms.entity.po.Topic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TopicMapper extends BaseMapper<Topic> {

}
