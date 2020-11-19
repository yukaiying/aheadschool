package com.ahead.school.dao;/*
 *文件名: TeacherDao
 *创建者: solfeng
 *创建时间:2020/11/12 14:16
 */

import com.ahead.school.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository("TeacherDao")
public interface TeacherDao extends JpaRepository<Teacher,Long>, JpaSpecificationExecutor<Teacher> {

}
