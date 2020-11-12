package com.ahead.school.dao;

import com.ahead.school.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeDao extends JpaRepository<Grade, Integer> {
}
