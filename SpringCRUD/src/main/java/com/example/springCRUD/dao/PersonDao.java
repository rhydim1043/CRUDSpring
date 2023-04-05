package com.example.springCRUD.dao;

import com.example.springCRUD.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

// PersonDao: an interface that defines the data access operations for the Person object.
// It contains two methods: int insertPerson(UUID id, Person person) and a
// default method int addPerson(Person person). insertPerson inserts a person object with the given UUID into
// the database, and insertPerson generates a UUID and calls insertPerson to insert the person object with the
// generated UUID.
public interface PersonDao {

    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person)
    {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonbyId(UUID id);

    int deletePersonbyId(UUID id);

    int updatePersonbyId(UUID id, Person person);
}
