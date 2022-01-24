package com.ferreira.apidemo.service;

import com.ferreira.apidemo.entity.AbstractEntity;
import com.ferreira.apidemo.repository.AbstractRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public abstract class AbstractService<E extends AbstractEntity, R extends AbstractRepository<E>> {

    protected R repository;

    private Class<E> entityClass;


    public abstract R getRepository();

    public E save(E entity) {
        return getRepository().save(entity);
    }

    public E findById(Long id) {
        Optional<E> optional = repository.findById(id);
        return optional.orElse(null);
    }

    public void delete(Long id) {
        E entity = findById(id);
        getRepository().delete(entity);
    }

    public ArrayList<E> findAll() {
        return (ArrayList<E>) getRepository().findAll();
    }
}

