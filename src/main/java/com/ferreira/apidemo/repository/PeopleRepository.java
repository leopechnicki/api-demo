package com.ferreira.apidemo.repository;

import com.ferreira.apidemo.entity.PeopleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends AbstractRepository<PeopleEntity> {

    @Override List<PeopleEntity> findAll();
}
