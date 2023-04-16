package com.fernandes.authspringsecurity.modules.user.services.mapper;

import com.fernandes.authspringsecurity.modules.user.entities.User;
import com.fernandes.authspringsecurity.modules.user.model.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserRequestMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "roles", ignore = true)
    User toUserEntity(UserRequest userRequest);
}
