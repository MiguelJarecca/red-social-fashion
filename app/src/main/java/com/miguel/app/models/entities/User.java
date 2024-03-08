package com.miguel.app.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String passord;

    public User() {
    }

    public User(Long id, String name, String lastname, String email, String passord) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.passord = passord;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassord() {
        return passord;
    }
    public void setPassord(String passord) {
        this.passord = passord;
    }

}