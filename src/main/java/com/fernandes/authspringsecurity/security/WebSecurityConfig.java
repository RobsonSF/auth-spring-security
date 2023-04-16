package com.fernandes.authspringsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) {
        try {
            http
                .csrf().disable()
                .authorizeHttpRequests((authorize) -> {
                    try {
                        authorize
                        .requestMatchers("/").permitAll()
                        .requestMatchers(HttpMethod.POST, "/users/create").permitAll()
                        .anyRequest().authenticated()
                        .and()
                        .httpBasic();
                    } catch (Exception e) {
                        throw new RuntimeException(e.getMessage());
                    }

                });

            return http.build();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Bean
    public AuthenticationManager authenticationManager(
            HttpSecurity http,
            PasswordEncoder passwordEncoder,
            CustomUserDetailsService userDetailsService
    ) {
        try {
            return http.getSharedObject(AuthenticationManagerBuilder.class)
                    .userDetailsService(userDetailsService)
                    .passwordEncoder(passwordEncoder)
                    .and()
                    .build();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
