package com.fernandes.authspringsecurity.modules.user.services.impl;

import com.fernandes.authspringsecurity.modules.user.repositories.UserRepository;
import com.fernandes.authspringsecurity.modules.user.entities.User;
import com.fernandes.authspringsecurity.modules.user.model.UserRequest;
import com.fernandes.authspringsecurity.modules.user.services.CreateUserService;
import com.fernandes.authspringsecurity.modules.user.services.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserServiceImpl implements CreateUserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserMapper mapper;

    @Override
    public User execute(UserRequest userRequest) {
        var user = mapper.toUserEntity(userRequest);
        return repository.save(user);
    }
}
