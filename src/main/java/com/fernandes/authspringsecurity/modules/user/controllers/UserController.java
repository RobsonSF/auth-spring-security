package com.fernandes.authspringsecurity.modules.user.controllers;

import com.fernandes.authspringsecurity.modules.user.controllers.mapper.UserResponseMapper;
import com.fernandes.authspringsecurity.modules.user.model.request.RoleToUserRequest;
import com.fernandes.authspringsecurity.modules.user.model.request.UserRequest;
import com.fernandes.authspringsecurity.modules.user.model.response.UserResponse;
import com.fernandes.authspringsecurity.modules.user.services.CreateRoleToUserService;
import com.fernandes.authspringsecurity.modules.user.services.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private CreateUserService service;

    @Autowired
    private CreateRoleToUserService roleToUserServiceImpl;

    @Autowired
    private UserResponseMapper mapper;

    @PostMapping("/create")
    public ResponseEntity<UserResponse> create(@RequestBody UserRequest userRequest) {
        var user = service.execute(userRequest);
        var userResponse = mapper.toUserResponse(user);
        return ResponseEntity.ok().body(userResponse);
    }

    @PostMapping("/role")
    public ResponseEntity<UserResponse> role(@RequestBody RoleToUserRequest roleToUserRequest) {
        var user = roleToUserServiceImpl.execute(roleToUserRequest);
        var userResponse = mapper.toUserResponse(user);
        return ResponseEntity.ok().body(userResponse);
    }

}
