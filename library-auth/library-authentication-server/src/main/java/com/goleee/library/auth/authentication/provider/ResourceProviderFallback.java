package com.goleee.library.auth.authentication.provider;

import com.goleee.library.sysadmin.organization.entity.po.Resource;
import com.springboot.cloud.common.core.entity.vo.Result;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class ResourceProviderFallback implements ResourceProvider {
    @Override
    public Result<Set<Resource>> resources() {
        return Result.success(new HashSet<Resource>());
    }

    @Override
    public Result<Set<Resource>> resources(String username) {
        return Result.success(new HashSet<Resource>());
    }
}
