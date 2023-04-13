package com.fernandes.authspringsecurity.modules.user.controllers;

import com.fernandes.authspringsecurity.modules.user.entities.User;
import com.fernandes.authspringsecurity.modules.user.model.RoleToUserRequest;
import com.fernandes.authspringsecurity.modules.user.model.UserRequest;
import com.fernandes.authspringsecurity.modules.user.services.CreateRoleToUserService;
import com.fernandes.authspringsecurity.modules.user.services.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private CreateUserService service;

    @Autowired
    private CreateRoleToUserService roleToUserServiceImpl;

    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody UserRequest userRequest) {
        var user = service.execute(userRequest);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/role")
    public ResponseEntity<User> role(@RequestBody RoleToUserRequest roleToUserRequest) {
        var user = roleToUserServiceImpl.execute(roleToUserRequest);
        return ResponseEntity.ok().body(user);
    }

}
