package com.lautaro.spring.error.springboot_error.repositories;

import java.util.List;
import java.util.Optional;

import com.lautaro.spring.error.springboot_error.models.domain.User;

public interface UserRepository {
    List<User> findAll();
    Optional<User> findById(Long id);
}
