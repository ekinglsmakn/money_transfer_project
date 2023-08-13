package com.ekinakin.money_transfer_project.serviceImp;

import com.ekinakin.money_transfer_project.model.entity.Person;
import com.ekinakin.money_transfer_project.repository.PersonRepo;
import com.ekinakin.money_transfer_project.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImp implements PersonService {
    @Autowired
    private PersonRepo personRepo;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Person save(Person person) {
        return this.personRepo.save(person);
    }
}
