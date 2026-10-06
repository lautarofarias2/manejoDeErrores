package com.lautaro.spring.error.springboot_error.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lautaro.spring.error.springboot_error.exceptions.UserNotFoundException;
import com.lautaro.spring.error.springboot_error.models.domain.User;
import com.lautaro.spring.error.springboot_error.services.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

    private final UserService service;

    public AppController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public String index(){
        // int value = 100 /0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "ok 200";
    }

    @GetMapping("/view/{id}")
    public User view(@PathVariable Long id){
        User user = service.findById(id).orElseThrow(() -> new UserNotFoundException("Error el usuario no existe!"));
        // Optional<User> optionalUser = service.findById(id);
        // if(optionalUser.isEmpty()){
        //     return ResponseEntity.notFound().build();
        // }
        System.out.println(user.getLastname());
        return user;
    }
}
