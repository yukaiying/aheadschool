package com.ahead.school.entity;/*
 *文件名: Teacher
 *创建者: solfeng
 *创建时间:2020/11/12 14:10
 */

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tab_teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "sex")
    private Long sex;
    @Column(name = "Job_Type")
    private String jobType;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "create_user")
    private int createUser;
    @Column(name = "update_time")
    private Date updateTime;
    @Column(name = "update_user")
    private int updateUser;

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

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCreateUser() {
        return createUser;
    }

    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(int updateUser) {
        this.updateUser = updateUser;
    }
}
