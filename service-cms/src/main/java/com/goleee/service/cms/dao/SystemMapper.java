package com.goleee.service.cms.dao;

import com.goleee.service.cms.entity.po.System;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SystemMapper extends BaseMapper<System> {

}
