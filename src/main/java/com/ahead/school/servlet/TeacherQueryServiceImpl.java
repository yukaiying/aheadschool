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

@Service
public class TeacherQueryServiceImpl implements TeacherQueryService {
    @Resource
    TeacherDao teacherDao;

    @Override
    public Page<Teacher> findTeacherCriteria(Integer page, Integer size, final Teacher teacher) {
        Pageable pageable =  PageRequest.of(page, size, Sort.Direction.ASC, "id");
        Page<Teacher> TeacherPage = teacherDao.findAll(new Specification<Teacher>() {

            @Override
            public Predicate toPredicate(Root<Teacher> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                Predicate p1 = criteriaBuilder.equal(root.get("name").as(String.class), teacher.getName());
                Predicate p2 = criteriaBuilder.equal(root.get("jobType").as(String.class), teacher.getJobType());
                Predicate p3 = criteriaBuilder.equal(root.get("id").as(String.class), teacher.getId());
                query.where(criteriaBuilder.and(p1, p2, p3));
                return query.getRestriction();
            }
        },pageable);
        return TeacherPage;
    }
}
