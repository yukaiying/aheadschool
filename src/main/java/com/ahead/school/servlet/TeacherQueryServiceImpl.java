package com.ahead.school.servlet;/*
 *文件名: TeacherQueryServiceImpl
 *创建者: solfeng
 *创建时间:2020/11/15 16:15
 */

import com.ahead.school.dao.TeacherDao;
import com.ahead.school.dao.TeacherQueryService;
import com.ahead.school.entity.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherQueryServiceImpl implements TeacherQueryService {
    @Resource
    TeacherDao teacherDao;

    @Override
    public Page<Teacher> findTeacherCriteria(Integer page, Integer size, final Teacher teacher) {
        Pageable pageable =  PageRequest.of(page, size, Sort.Direction.ASC, "id");

        Page<Teacher> TeacherPage = teacherDao.findAll((Specification<Teacher>) (root, query, criteriaBuilder) -> {
            List<Predicate> list = new ArrayList<>();
            if(null!=teacher.getName()&&!"".equals(teacher.getName())){
                list.add(criteriaBuilder.equal(root.get("name").as(String.class), teacher.getName()));
            }
            if(null!=teacher.getId()&&!"".equals(teacher.getId())){
                list.add(criteriaBuilder.equal(root.get("isbn").as(String.class), teacher.getId()));
            }
            if(null!=teacher.getSex()&&!"".equals(teacher.getSex())){
                list.add(criteriaBuilder.equal(root.get("author").as(String.class), teacher.getSex()));
            }
            Predicate[] p = new Predicate[list.size()];
            return criteriaBuilder.and(list.toArray(p));
        },pageable);
        return TeacherPage;
    }
}
