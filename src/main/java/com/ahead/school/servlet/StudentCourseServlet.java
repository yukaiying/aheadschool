package com.ahead.school.servlet;

import com.ahead.school.dao.StudentCourseDao;
import com.ahead.school.entity.StudentCourse;
import com.ahead.school.entity.StudentCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCourseServlet {

    @Autowired
    private StudentCourseDao studentCourseDao;

    public List<StudentCourse> studentCourseList() {
        List<StudentCourse> studentCourse = studentCourseDao.findAll();
        return studentCourse;
    }

    public StudentCourse insertOrUpdate(StudentCourse studentCourse){
        StudentCourse insertStudentCourse = studentCourseDao.save(studentCourse);
        return insertStudentCourse;
    }

    public void delById(Integer id){
        studentCourseDao.deleteById(id);
    }

    public StudentCourse getStudentCourseById(Integer id){
        StudentCourse studentCourse = studentCourseDao.findById(id).orElseGet(StudentCourse::new);
        return studentCourse;
    }
}
