package com.goleee.service.cms.dao;

import com.goleee.service.cms.entity.po.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
