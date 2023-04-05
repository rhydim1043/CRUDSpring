package com.example.springCRUD.dao;

import com.example.springCRUD.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MockPersonDataAccessService implements PersonDao{

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id,person.getName()));
        return 1;
    }
}
