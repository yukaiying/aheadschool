package com.ahead.school.servlet;

import com.ahead.school.dao.GradleDao;
import com.ahead.school.entity.Gradle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServlet {

    @Autowired
    private GradleDao gradeDao;

    public void saveGrade(List<Gradle> list) {

    }
}
