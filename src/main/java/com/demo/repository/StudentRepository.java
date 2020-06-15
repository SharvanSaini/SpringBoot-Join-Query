package com.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.StudentEntity;



@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

    @Override
    public List<StudentEntity> findAll();
}
