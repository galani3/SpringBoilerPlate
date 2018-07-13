package com.cme.codeUp.codeUp2018.services;

import com.cme.codeUp.codeUp2018.PersonRepository;
import com.cme.codeUp.codeUp2018.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void addPerson(Person person)
    {
        personRepository.save(person);
    }

    public Iterable<Person> retrievePeople()
    {
        Iterable<Person> retrieved = personRepository.findAll();
        System.out.println(retrieved);
        System.out.println("Got here now");
        return retrieved;
    }
}
