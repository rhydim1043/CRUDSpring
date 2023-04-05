package com.example.springCRUD.service;

import com.example.springCRUD.dao.PersonDao;
import com.example.springCRUD.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDAO") PersonDao personDao) {
        this.personDao = personDao;
    }
    public int addPerson(Person person)
    {
        return personDao.insertPerson(person);
    }
    public List<Person> getAllPeople()
    {
        return personDao.selectAllPeople();
    }

    public Optional<Person> getPersonbyId(UUID id){
        return personDao.selectPersonbyId(id);
    }

    public int deletePersonbyId(UUID id)
    {
        return personDao.deletePersonbyId(id);
    }

    public int updatePersonbyId(UUID id, Person person)
    {
        return personDao.updatePersonbyId(id, person);
    }
}
