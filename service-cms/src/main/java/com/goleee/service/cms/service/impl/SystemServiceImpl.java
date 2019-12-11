package com.goleee.service.cms.service.impl;

import com.goleee.service.cms.entity.param.SystemQueryParam;
import com.goleee.service.cms.entity.po.System;
import com.goleee.service.cms.dao.SystemMapper;
import com.goleee.service.cms.service.ISystemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemServiceImpl extends ServiceImpl<SystemMapper, System> implements ISystemService {

    @Override
    public System get(String id) {
        return null;
    }

    @Override
    public boolean add(System system) {
        return false;
    }

    @Override
    public boolean update(System system) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public List<System> query(SystemQueryParam systemQueryParam) {
        return null;
    }
}
