package com.fernandes.authspringsecurity.security;

import com.fernandes.authspringsecurity.modules.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        var optionalUser = repository.findByUsername(username);
        optionalUser.orElseThrow(
                () -> new RuntimeException("User not found")
        );
        var user  = optionalUser.get();

        return UserPrincipal.create(user);
    }
}
