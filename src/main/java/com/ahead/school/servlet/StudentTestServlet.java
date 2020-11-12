package com.ahead.school.servlet;

import com.ahead.school.dao.StudentDao;
import com.ahead.school.entity.Student;
import com.ahead.school.dao.StudentTestDao;

import com.ahead.school.entity.StudentTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentTestServlet {

    @Autowired
    private StudentTestDao studentTetsDao;

}
