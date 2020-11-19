package com.ahead.school.dao;/*
 *文件名: TeacherQueryService
 *创建者: solfeng
 *创建时间:2020/11/15 16:08
 */

import com.ahead.school.entity.Teacher;
import org.springframework.data.domain.Page;


public interface TeacherQueryService {
    Page<Teacher> findTeacherCriteria(Integer page, Integer size, Teacher teacher);
}
