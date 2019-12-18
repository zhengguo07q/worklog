package com.goleee.auth.authorization.service.impl;

import com.goleee.auth.authorization.entity.Role;
import com.goleee.auth.authorization.provider.OrganizationProvider;
import com.goleee.auth.authorization.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private OrganizationProvider organizationProvider;

    @Override
    public Set<Role> queryUserRolesByUserId(String userId) {
        return organizationProvider.queryRolesByUserId(userId).getData();
    }

}
