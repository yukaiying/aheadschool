package com.ahead.school.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_student")
@Entity
public class StudentTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String sex;

    private int num1;

    private int num2;

    private String identity;

    private String class_id;

    private String course_id;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getIdentity() { return identity; }

    public void setIdentity(String identity) { this.identity = identity; }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
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
