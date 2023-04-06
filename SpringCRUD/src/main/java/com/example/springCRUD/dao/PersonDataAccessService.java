package com.example.springCRUD.dao;

import com.example.springCRUD.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("database")
public class PersonDataAccessService implements PersonDao{
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        List<Person> listAPI = new ArrayList<>();
        for (int i=0;i<=100;i++)
        {
            listAPI.add(new Person(UUID.randomUUID(), "Person No: "+i));
        }
        return listAPI;
    }

    @Override
    public Optional<Person> selectPersonbyId(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonbyId(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonbyId(UUID id, Person person) {
        return 0;
    }
}
