package com.fernandes.authspringsecurity.modules.user.model;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public record UserRequest(
        String name,
        String username,
        String password
) {}
