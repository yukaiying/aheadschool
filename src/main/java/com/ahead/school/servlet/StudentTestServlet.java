package com.ahead.school.servlet;

import com.ahead.school.dao.StudentTestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentTestServlet {

    @Autowired
    private StudentTestDao studentTestDao;

}
