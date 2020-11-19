package com.ahead.school.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tab_course")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String course_name;

    private String type;

    private String term;

    private String grade_id;

    private String exam_type;

    @Column(name = "create_time")
    private Date create_time;

    @Column(name = "create_user")
    private Long create_User;

    @Column(name = "update_time")
    private Date update_time;

    @Column(name = "update_user")
    private Long update_User;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(String grade_id) {
        this.grade_id = grade_id;
    }

    public String getExam_type() {
        return exam_type;
    }

    public void setExam_type(String exam_type) {
        this.exam_type = exam_type;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Long getCreate_User() {
        return create_User;
    }

    public void setCreate_User(Long create_User) {
        this.create_User = create_User;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Long getUpdate_User() {
        return update_User;
    }

    public void setUpdate_User(Long update_User) {
        this.update_User = update_User;
    }
}