package com.example.demo.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MyAppUserRepository extends JpaRepository<MyAppUser, Long> {
    Optional<MyAppUser> findByUsername(String username);
}
