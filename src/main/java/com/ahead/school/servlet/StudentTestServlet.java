package com.ahead.school.servlet;

<<<<<<< HEAD:src/main/java/com/ahead/school/servlet/StudentServlet.java

import com.ahead.school.dao.StudentDao;
import com.ahead.school.entity.Student;
=======
import com.ahead.school.dao.StudentTestDao;
>>>>>>> guobin2:src/main/java/com/ahead/school/servlet/StudentTestServlet.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentTestServlet {

    @Autowired
<<<<<<< HEAD:src/main/java/com/ahead/school/servlet/StudentServlet.java
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

=======
    private StudentTestDao studentDao;
>>>>>>> guobin2:src/main/java/com/ahead/school/servlet/StudentTestServlet.java
}
