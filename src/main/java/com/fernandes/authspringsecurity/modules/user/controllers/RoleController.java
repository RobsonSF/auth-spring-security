package com.fernandes.authspringsecurity.modules.user.controllers;

import com.fernandes.authspringsecurity.modules.user.entities.Role;
import com.fernandes.authspringsecurity.modules.user.model.RoleRequest;
import com.fernandes.authspringsecurity.modules.user.services.CreateRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private CreateRoleService service;

    @PostMapping("/create")
    public ResponseEntity<Role> create(@RequestBody RoleRequest roleRequest) {
        var role = service.execute(roleRequest);
        return ResponseEntity.ok().body(role);
    }
}
