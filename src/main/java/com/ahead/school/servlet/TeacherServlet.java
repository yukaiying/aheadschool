package com.ahead.school.servlet;/*
 *文件名: TeacherServlet
 *创建者: solfeng
 *创建时间:2020/11/12 14:18
 */

import com.ahead.school.dao.TeacherDao;
import com.ahead.school.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServlet {
    @Autowired
    private TeacherDao teacherDao;

    public Teacher insertOrUpdate(Teacher teacher) {
        return teacherDao.save(teacher);

    }

    public void delById(Long id){
        teacherDao.deleteById(id);
    }

    public List<Teacher> teachersList() {
        return teacherDao.findAll();

    }

    public Teacher getteachersById(Long id) {
        return teacherDao.findById(id).orElseGet(Teacher::new);

    }
}
