package com.gmm.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by john on 2017-04-29.
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {

    public List<Student> findByAge(Integer age);
}
