package com.fernandes.authspringsecurity.modules.user.services;

import com.fernandes.authspringsecurity.modules.user.entities.User;
import com.fernandes.authspringsecurity.modules.user.model.UserRequest;

public interface CreateUserService {
    User execute(UserRequest userRequest);
}
