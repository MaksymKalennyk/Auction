package com.example.auction.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
