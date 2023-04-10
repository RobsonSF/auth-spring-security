package com.fernandes.authspringsecurity.modules.user.controllers;

import com.fernandes.authspringsecurity.modules.user.entities.User;
import com.fernandes.authspringsecurity.modules.user.model.UserRequest;
import com.fernandes.authspringsecurity.modules.user.services.impl.CreateUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    CreateUserServiceImpl service;

    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody UserRequest userRequest) {
        var user = service.execute(userRequest);
        return ResponseEntity.ok().body(user);
    }


}
