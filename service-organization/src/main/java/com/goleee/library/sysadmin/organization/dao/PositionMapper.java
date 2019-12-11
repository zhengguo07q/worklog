package com.goleee.library.sysadmin.organization.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.goleee.library.sysadmin.organization.entity.po.Position;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PositionMapper extends BaseMapper<Position> {
}