package com.ferreira.apidemo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class PeopleEntity extends AbstractEntity {

    @Getter
    @Setter
    private String name;
}
