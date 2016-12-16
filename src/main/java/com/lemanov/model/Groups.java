package com.lemanov.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Extr on 16.12.2016.
 */

@Entity
public class Groups {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Groups() {}

    public Groups(String name) {
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
}
