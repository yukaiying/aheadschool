package com.ahead.school.servlet;

import com.ahead.school.dao.ClassDao;
import com.ahead.school.dao.GradeDao;
import com.ahead.school.entity.ClassEntity;
import com.ahead.school.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServlet {

    @Autowired
    private ClassDao classDao;
    private GradeDao gradeDao;

    public List<ClassEntity> classEntityList() {
        List<ClassEntity> classEntity = classDao.findAll();
//        List<Grade> grade = gradeDao.findAll();
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
