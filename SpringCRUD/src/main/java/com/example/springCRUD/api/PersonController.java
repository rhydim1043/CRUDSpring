package com.example.springCRUD.api;

import com.example.springCRUD.model.Person;
import com.example.springCRUD.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService)
    {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person)
    {
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople()
    {
        return personService.getAllPeople();
    }

    @GetMapping(path = "{id}")
    public Person getPersonbyId(@PathVariable("id") UUID id)
    {
        return personService.getPersonbyId(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonbyId(@PathVariable("id") UUID id)
    {
        personService.deletePersonbyId(id);
    }

    @PutMapping
    public int updatePersonbyId(@PathVariable("id") UUID id, @RequestBody Person person)
    {
        return personService.updatePersonbyId(id, person);
    }

}
