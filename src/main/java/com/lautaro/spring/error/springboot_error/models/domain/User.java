package com.lautaro.spring.error.springboot_error.models.domain;

public class User {

    private Long id;
    private String name;
    private String lastname;
    private Role role;

    public User() {
    }

    public User(Long id, String lastname, String name) {
        this.id = id;
        this.lastname = lastname;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Role getRole() {
        return role;
    }
    // public String getRoleName() {
    //     return role.getName();
    // }

    public void setRole(Role role) {
        this.role = role;
    }


}
