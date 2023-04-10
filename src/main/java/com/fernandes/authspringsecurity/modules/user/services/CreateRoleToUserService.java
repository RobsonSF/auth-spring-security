package com.fernandes.authspringsecurity.modules.user.services;

import com.fernandes.authspringsecurity.modules.user.entities.User;
import com.fernandes.authspringsecurity.modules.user.model.RoleToUserRequest;

public interface CreateRoleToUserService {
    User execute(RoleToUserRequest roleToUserRequest);
}
