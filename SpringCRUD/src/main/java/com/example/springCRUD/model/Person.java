package com.example.springCRUD.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

//Person: a simple POJO (Plain Old Java Object) class representing a person with an id and a name
public class Person {
    private final UUID id;
    private final String name;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
