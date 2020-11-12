package com.ahead.school.servlet;


import com.ahead.school.dao.StudentDao;
import com.ahead.school.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServlet {

    @Autowired
    private StudentDao studentDao;
    public Student insertOrUpdate(Student student){
        return studentDao.save(student);
    }
    public void delByStudentId(Long id){ studentDao.deleteById(id); }

    public List<Student> studentList(){
        return studentDao.findAll();
    }

    public Student getStudentById(Long StudentDaoy){
        return studentDao.findById(StudentDaoy).orElseGet(() -> new Student());
    }

}
