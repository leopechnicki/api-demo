package com.ferreira.apidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface AbstractRepository<E> extends JpaRepository<E, Long>{
    @Transactional(readOnly = true)
    List<E> findAll();

    @Transactional(readOnly = true)
    Optional<E> findById(Long id);
}


