package com.lautaro.spring.error.springboot_error.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lautaro.spring.error.springboot_error.models.domain.User;
import com.lautaro.spring.error.springboot_error.repositories.UserRepository;
import com.lautaro.spring.error.springboot_error.repositories.UserRepositoryImpl;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    public UserServiceImpl(UserRepositoryImpl repository){
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

}
