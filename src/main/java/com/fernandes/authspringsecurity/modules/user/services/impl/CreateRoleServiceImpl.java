package com.fernandes.authspringsecurity.modules.user.services.impl;

import com.fernandes.authspringsecurity.modules.user.entities.Role;
import com.fernandes.authspringsecurity.modules.user.model.request.RoleRequest;
import com.fernandes.authspringsecurity.modules.user.repositories.RoleRepository;
import com.fernandes.authspringsecurity.modules.user.services.CreateRoleService;
import com.fernandes.authspringsecurity.modules.user.services.mapper.RoleRequestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateRoleServiceImpl implements CreateRoleService {

    @Autowired
    private RoleRepository repository;

    @Autowired
    private RoleRequestMapper mapper;

    @Override
    public Role execute(RoleRequest roleRequest) {
        var role = mapper.toRoleEntity(roleRequest);
        return repository.save(role);
    }
}
