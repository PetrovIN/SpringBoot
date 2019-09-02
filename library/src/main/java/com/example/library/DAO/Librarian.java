package com.example.library.DAO;

import org.springframework.stereotype.Component;

@Component
public class Librarian {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
