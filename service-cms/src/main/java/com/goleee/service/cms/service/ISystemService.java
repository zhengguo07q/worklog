package com.goleee.service.cms.service;

import com.goleee.service.cms.entity.param.SettingQueryParam;
import com.goleee.service.cms.entity.param.SystemQueryParam;
import com.goleee.service.cms.entity.po.Setting;
import com.goleee.service.cms.entity.po.System;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface ISystemService extends IService<System> {
    System get(String id);

    boolean add(System system);

    boolean update(System system);

    boolean delete(String id);

    List<System> query(SystemQueryParam systemQueryParam);
}
