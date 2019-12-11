package com.goleee.service.cms.service.impl;

import com.alicp.jetcache.anno.CacheInvalidate;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.goleee.service.cms.entity.param.SettingQueryParam;
import com.goleee.service.cms.entity.po.Setting;
import com.goleee.service.cms.dao.SettingMapper;
import com.goleee.service.cms.service.ISettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SettingServiceImpl extends ServiceImpl<SettingMapper, Setting> implements ISettingService {

    @Override
    @Cached(name = "setting::", key = "#id", cacheType = CacheType.BOTH)
    public Setting get(String id) {
        return this.getById(id);
    }

    @Override
    public boolean add(Setting setting) {
        return this.save(setting);
    }

    @Override
    @CacheInvalidate(name = "setting::", key="#id")
    public boolean update(Setting setting) {
        return this.updateById(setting);
    }

    @Override
    @CacheInvalidate(name = "setting::", key="#id")
    public boolean delete(String id) {
        return this.removeById(id);
    }

    @Override
    public List<Setting> query(SettingQueryParam settingQueryParam) {
        QueryWrapper<Setting> queryWrapper = settingQueryParam.build();
        queryWrapper.eq("key", settingQueryParam.getKey());
        return this.list(queryWrapper);
    }
}
