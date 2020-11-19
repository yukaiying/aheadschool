package com.ahead.school.dao;

import com.ahead.school.entity.StudentTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentTestDao extends JpaRepository<StudentTest, Long> {
}
