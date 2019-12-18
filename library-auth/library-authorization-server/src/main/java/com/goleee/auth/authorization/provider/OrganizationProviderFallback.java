package com.goleee.auth.authorization.provider;

import com.goleee.auth.authorization.entity.Role;
import com.goleee.auth.authorization.entity.User;
import com.springboot.cloud.common.core.entity.vo.Result;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class OrganizationProviderFallback implements OrganizationProvider {

    @Override
    public Result<User> getUserByUniqueId(String uniqueId) {
        return Result.success(new User());
    }

    @Override
    public Result<Set<Role>> queryRolesByUserId(String userId) {
        return Result.success(new HashSet<Role>());
    }
}
