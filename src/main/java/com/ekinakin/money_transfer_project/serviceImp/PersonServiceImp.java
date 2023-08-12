package com.ekinakin.money_transfer_project.serviceImp;

import com.ekinakin.money_transfer_project.model.entity.Person;
import com.ekinakin.money_transfer_project.repository.PersonRepo;
import com.ekinakin.money_transfer_project.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService {
    @Autowired
    private PersonRepo personRepo;

    @Override
    public Person save(Person person) {
        return this.personRepo.save(person);
    }
}
