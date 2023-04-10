package com.fernandes.authspringsecurity.modules.user.services;

import com.fernandes.authspringsecurity.modules.user.entities.Role;
import com.fernandes.authspringsecurity.modules.user.model.RoleRequest;

public interface CreateRoleService {
    Role execute(RoleRequest roleRequest);
}
