package com.ahead.school.servlet;

import com.ahead.school.dao.ScoreDao;
import com.ahead.school.entity.StudentScoreExcelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServlet {

    @Autowired
    private ScoreDao scoreDao;

    public void saveScore(List<StudentScoreExcelEntity> list){

    }
}
