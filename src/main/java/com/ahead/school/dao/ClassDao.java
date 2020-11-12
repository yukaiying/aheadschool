package com.ahead.school.dao;

import com.ahead.school.entity.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassDao extends JpaRepository<ClassEntity, Integer> {
}