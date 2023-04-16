package com.fernandes.authspringsecurity.modules.user.controllers.mapper;

import com.fernandes.authspringsecurity.modules.user.entities.Role;
import com.fernandes.authspringsecurity.modules.user.model.response.RoleResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface RoleResponseMapper {

    RoleResponse toRoleResponse(Role role);
}
