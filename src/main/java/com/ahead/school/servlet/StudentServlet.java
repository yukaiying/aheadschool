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
    public id insertOrUpdate(StudentDao studentDao){
        return studentDao.save(Id);
    }
    public void delById(Long id){ studentDao.deleteById(id); }

    public List<StudentDao> studentDaoList(){
        return studentDao.findAll();
    }

    public id getidById(Long StudentDaoy){
        return studentDao.findById(id).orElseGet(() -> new id());
    }

}
