package com.ahead.school.servlet;


import com.ahead.school.dao.idDao;
import com.ahead.school.entity.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class idServlet {

    @Autowired
    private idDao IdDao;
    public id insertOrUpdate(id Id){
        return IdDao.save(Id);
    }
    public void delById(Long id){
        IdDao.deleteById(id);
    }

    public List<id> IdList(){
        return IdDao.findAll();
    }

    public id getidById(Long id){
        return IdDao.findById(id).orElseGet(() -> new id());
    }

}
