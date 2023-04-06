package com.example.springCRUD.dao;

import com.example.springCRUD.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

// MockPersonDataAccessService: a mock implementation of the PersonDao interface,
// which uses an in-memory list to simulate a database.

@Repository("fakeDAO")
public class MockPersonDataAccessService implements PersonDao{

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id,person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public int deletePersonbyId(UUID id){
        Optional<Person> findPerson = selectPersonbyId(id);
        if(findPerson.isEmpty()) return 0;
        DB.remove(findPerson.get());
        return 1;
    }

    @Override
    public Optional<Person> selectPersonbyId(UUID id) {
        return DB.stream().filter(person -> person.getId().equals(id)).findFirst();
    }

    @Override
    public int updatePersonbyId(UUID id, Person person) {
        return selectPersonbyId(id).map(p->{
            int index = DB.indexOf(person);
            if(index>=0){
                DB.set(index, person);
                return 1;
            }
            return 0;
        }).orElse(0);
    }
}
