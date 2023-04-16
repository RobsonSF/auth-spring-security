package com.fernandes.authspringsecurity.modules.user.services.impl;

import com.fernandes.authspringsecurity.modules.user.entities.Role;
import com.fernandes.authspringsecurity.modules.user.entities.User;
import com.fernandes.authspringsecurity.modules.user.model.request.RoleToUserRequest;
import com.fernandes.authspringsecurity.modules.user.repositories.UserRepository;
import com.fernandes.authspringsecurity.modules.user.services.CreateRoleToUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateRoleToUserServiceImpl implements CreateRoleToUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User execute(RoleToUserRequest roleToUserRequest) {
        var optionalUser = repository.findById(roleToUserRequest.idUser());
        optionalUser.orElseThrow(
                () -> new RuntimeException("User not found")
        );
        var user  = optionalUser.get();
        var roles = roleToUserRequest
                            .idsRoles()
                            .stream()
                            .map(Role::new)
                            .toList();

        user.setRoles(roles);

        return repository.save(user);
    }
}
