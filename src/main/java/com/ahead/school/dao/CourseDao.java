package com.ahead.school.dao;

import com.ahead.school.entity.Course;
import com.ahead.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {
}
