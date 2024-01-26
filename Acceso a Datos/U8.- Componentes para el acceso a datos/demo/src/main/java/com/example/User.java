package com.example;

public class User {
    private int id;
    private String username;

    // Constructor sin argumentos (necesario para Hibernate)
    public User() {
    }

    // Constructor con todos los atributos
    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }

    // Getter para el atributo "id"
    public int getId() {
        return id;
    }

    // Setter para el atributo "id"
    public void setId(int id) {
        this.id = id;
    }

    // Getter para el atributo "username"
    public String getUsername() {
        return username;
    }

    // Setter para el atributo "username"
    public void setUsername(String username) {
        this.username = username;
    }
}
