package com.ahead.school.servlet;

import com.ahead.school.dao.CourseDao;
import com.ahead.school.entity.Course;
import com.ahead.school.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServlet {
    @Autowired
    private CourseDao courseDao;
    public Course insertOrUpdate(Course course){
        return courseDao.save(course);
    }
    public void delByStudentId(Long id){ courseDao.deleteById(id); }

    public List<Course> courseList(){
        return courseDao.findAll();
    }

    public Course getCourseById(Long CourseDao){
        return courseDao.findById(CourseDao).orElseGet(Course::new);
    }




}
