package com.fernandes.authspringsecurity.modules.user.services.mapper;

import com.fernandes.authspringsecurity.modules.user.entities.Role;
import com.fernandes.authspringsecurity.modules.user.model.RoleRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface RoleMapper {

    @Mapping(target = "id", ignore = true)
    Role toRoleEntity(RoleRequest roleRequest);
}
