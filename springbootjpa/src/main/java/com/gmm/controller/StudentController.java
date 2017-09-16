package com.gmm.controller;

import com.gmm.model.Student;
import com.gmm.model.StudentRepository;
import com.gmm.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by john on 2017-04-29.
 */
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentServices studentServices;

    /**
     * 查询所有学生列表;
     * @return
     */
    @GetMapping(value = "/finAll")
    public List<Student> studentList(){
        return studentRepository.findAll();

    }

    /**
     * 添加学生信息;
     * @return
     */
    @GetMapping(value = "/addStudent")
    public Student addStudent(){
        Student student1 = new Student();
        student1.setAge(23);
        student1.setGender("女");
        student1.setsName("戴");
        Student student = studentRepository.save(student1);
        return student;
    }

    /**
     * 通过id查询学生信息;
     * @param id
     * @return
     */
    public Student studentFindOne(@PathVariable("id") Integer id){
        Student student = studentRepository.findOne(id);
        return student;

    }

    /**
     * 更新学生信息;
     * @param id
     * @param age
     * @param sName
     * @param gender
     * @return
     */
    public Student updateStudent(@PathVariable("id") Integer id,
                             @RequestParam("age") Integer age,
                             @RequestParam("sName") String sName,
                             @RequestParam("gender") String gender){
        Student student = studentRepository.findOne(id);
        //Student students = new Student();
        student.setsName("小华");
        student.setGender("男");
        student.setAge(32);
        student.setsId(3);
        return studentRepository.save(student);

    }

    /**
     * 删除学生信息;
     * @param id
     */
    public void deleteStudent(@PathVariable("id") Integer id){
         studentRepository.delete(id);
    }

    @GetMapping(value = "/student/age")
    public void findByAge(@PathVariable("age") Integer age){
        List<Student> studentList = studentRepository.findByAge(age);
    }



}
