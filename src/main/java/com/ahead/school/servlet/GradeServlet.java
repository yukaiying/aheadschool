package com.ahead.school.servlet;

import com.ahead.school.dao.GradeDao;
import com.ahead.school.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServlet {

    @Autowired
    private GradeDao gradeDao;

    public List<Grade> gradeList() {
        List<Grade> grade = gradeDao.findAll();
        return grade;
    }
}
