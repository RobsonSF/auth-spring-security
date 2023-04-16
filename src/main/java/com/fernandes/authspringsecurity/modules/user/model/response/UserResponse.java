package com.fernandes.authspringsecurity.modules.user.model.response;

import java.util.List;

public record UserResponse(
        String name,
        String username,
        List<RoleResponse> roles
) {}
