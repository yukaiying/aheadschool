package com.ahead.school.servlet;

import com.ahead.school.dao.ClassDao;
import com.ahead.school.entity.ClassEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServlet {

    @Autowired
    private ClassDao classDao;

    public void saveClass(List<ClassEntity> list) {}

    public List<ClassEntity> classList() {
        List<ClassEntity> classEntity = classDao.findAll();
        return classEntity;
    }
    public ClassEntity insertOrUpdate(ClassEntity classEntity){
        ClassEntity insertClassEntity = classDao.save(classEntity);
        return insertClassEntity;
    }
    public void delById(Integer id){
        classDao.deleteById(id);
    }
    public ClassEntity getClassEntityById(Integer id){
        ClassEntity classEntity = classDao.findById(id).orElseGet(ClassEntity::new);
        return classEntity;
    }
}
