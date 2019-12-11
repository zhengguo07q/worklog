package com.goleee.service.cms.dao;

import com.goleee.service.cms.entity.po.Setting;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SettingMapper extends BaseMapper<Setting> {

}
