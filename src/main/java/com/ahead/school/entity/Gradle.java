package com.ahead.school.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tab_gradle")
<<<<<<< HEAD:src/main/java/com/ahead/school/entity/Gradle.java
public class Gradle {
=======
public class Grade {
>>>>>>> 1ff57ca (commit):src/main/java/com/ahead/school/entity/Grade.java
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "grade_name")
    private String gradeName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "create_user")
    private String createUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}
