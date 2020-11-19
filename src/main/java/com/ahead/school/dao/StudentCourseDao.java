package com.ahead.school.dao;

import com.ahead.school.entity.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseDao extends JpaRepository<StudentCourse,Integer> {
}
