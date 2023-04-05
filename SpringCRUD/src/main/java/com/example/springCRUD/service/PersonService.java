package com.example.springCRUD.service;

import com.example.springCRUD.dao.PersonDao;
import com.example.springCRUD.model.Person;

import java.util.UUID;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }
    public int addPerson(Person person)
    {
        return personDao.insertPerson(person);
    }
}
