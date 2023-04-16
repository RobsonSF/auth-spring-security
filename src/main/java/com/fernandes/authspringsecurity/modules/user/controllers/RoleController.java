package com.fernandes.authspringsecurity.modules.user.controllers;

import com.fernandes.authspringsecurity.modules.user.controllers.mapper.RoleResponseMapper;
import com.fernandes.authspringsecurity.modules.user.model.request.RoleRequest;
import com.fernandes.authspringsecurity.modules.user.model.response.RoleResponse;
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

    @Autowired
    private RoleResponseMapper mapper;

    @PostMapping("/create")
    public ResponseEntity<RoleResponse> create(@RequestBody RoleRequest roleRequest) {
        var role = service.execute(roleRequest);
        var roleResponse = mapper.toRoleResponse(role);
        return ResponseEntity.ok().body(roleResponse);
    }
}
