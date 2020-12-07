package com.ahead.school.servlet;

import com.ahead.school.dao.StudentCourseDao;
import com.ahead.school.dao.StudentDao;
import com.ahead.school.entity.Student;
import com.ahead.school.entity.StudentCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServlet {
    @Autowired
    private StudentDao studentDao;
    public List<Student> studentList(){
        return studentDao.findAll();
    }

    public List<Student> getStudentById() {
        List<Student> studentCourse = studentDao.findAll();
        return studentCourse;
    }

    public Student insertOrUpdate(Student studentCourse){
        Student insertStudentCourse = studentDao.save(studentCourse);
        return insertStudentCourse;
    }

    public void delByStudentId(Integer id){
        studentDao.deleteById(id);
    }

    public Student getStudentById(Integer id) {
        Student studentCourse = studentDao.findById(id).orElseGet(Student::new);
        return studentCourse;
    }
}
