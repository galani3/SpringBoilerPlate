package com.cme.codeUp.codeUp2018;

import com.cme.codeUp.codeUp2018.entities.Person;
import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PersonRepository extends CrudRepository<Person, Long> {

}

