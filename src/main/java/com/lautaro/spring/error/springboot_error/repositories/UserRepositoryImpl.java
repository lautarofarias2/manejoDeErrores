package com.lautaro.spring.error.springboot_error.repositories;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import com.lautaro.spring.error.springboot_error.models.domain.User;

import tools.jackson.databind.ObjectMapper;

@Repository
public class UserRepositoryImpl implements UserRepository{
    private List<User> users;

    public UserRepositoryImpl(){
        Resource resource = new ClassPathResource("json/datos.json");
        ReadValueJson(resource);
    }

    private void ReadValueJson(Resource resource) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            users = Arrays.asList(objectMapper.readValue(resource.getFile(), User[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter(
            u -> u.getId().equals(id)
        ).findAny();
        // for (User u : users) {
        //     if(u.getId().equals(id)){
        //         user = u;
        //         break;
        //     }
        // }
    }

    
}
