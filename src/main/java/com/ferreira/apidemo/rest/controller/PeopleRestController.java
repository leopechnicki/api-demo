package com.ferreira.apidemo.rest.controller;

import com.ferreira.apidemo.entity.PeopleEntity;
import com.ferreira.apidemo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/people")
public class PeopleRestController {
    @Autowired
    private PeopleService peopleService;

    @GetMapping(value = "/getAll", produces = "application/json")
    public ResponseEntity<List<PeopleEntity>> getAll(){
        List<PeopleEntity> peopleEntityList = peopleService.getRepository().findAll();
        return peopleEntityList.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(peopleEntityList, HttpStatus.OK);
    }
}

