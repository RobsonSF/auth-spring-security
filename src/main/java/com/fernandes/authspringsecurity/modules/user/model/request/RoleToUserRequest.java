package com.fernandes.authspringsecurity.modules.user.model.request;

import java.util.List;
import java.util.UUID;

public record RoleToUserRequest(
        UUID idUser,
        List<UUID> idsRoles
) {}
