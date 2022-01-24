package com.ferreira.apidemo.service;

import com.ferreira.apidemo.entity.PeopleEntity;
import com.ferreira.apidemo.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService extends AbstractService<PeopleEntity, PeopleRepository> {

    @Autowired
    private PeopleRepository peopleRepository;

    @Override public PeopleRepository getRepository() {
        return this.peopleRepository;
    }
}
