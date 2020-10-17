package com.ahead.school.servlet;

import com.ahead.school.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServlet {

    @Autowired
    private StudentDao studentDao;
}
