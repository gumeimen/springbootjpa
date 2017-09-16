package com.gmm.services;

import com.gmm.model.Student;
import com.gmm.model.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by john on 2017-04-29.
 */
@Service
public class StudentServices {

    @Autowired
    private StudentRepository studentRepository;

    public void insertTwo(){
        Student  student1 = new Student();

        student1.setAge(33);
        student1.setGender("女");
        student1.setsName("小雨");
        student1.setsId(5);
        studentRepository.save(student1);

        Student  student2 = new Student();
        student2.setAge(34);
        student2.setGender("男");
        student2.setsName("小强");
        student2.setsId(6);
        studentRepository.save(student2);

    }

}
