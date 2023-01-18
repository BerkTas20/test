package com.junit.test.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String role;

    public User(int id, String name, String role) {
        super();
        this.id = id;
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
    }
}