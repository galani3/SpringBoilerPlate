package com.cme.codeUp.codeUp2018.controllers;

import com.cme.codeUp.codeUp2018.entities.Person;
import com.cme.codeUp.codeUp2018.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api")
public class ApiController {

    @Autowired
    private PersonService personService;

    @GetMapping(path = "/addPerson") // Map ONLY GET Requests
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {

        Person n = new Person();
        n.setName(name);
        n.setEmail(email);
        personService.addPerson(n);
        return "Saved new person";

    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Person> getAllUsers() {
        // This returns a JSON or XML with the users
        return personService.retrievePeople();
    }
}
