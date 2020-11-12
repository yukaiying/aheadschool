package com.ahead.school.dao;


import com.ahead.school.entity.id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Long>{
}
