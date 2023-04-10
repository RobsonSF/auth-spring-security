package com.fernandes.authspringsecurity.modules.user.repositories;

import com.fernandes.authspringsecurity.modules.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
