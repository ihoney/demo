package com.rainbow.cloud.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by caihongli on 2017/5/19.
 */
@Entity
@Table(name = "user")
@DynamicInsert
@DynamicUpdate
public class User extends BaseEntity {

    @Column(columnDefinition = "varchar(60) comment '用户名'")
    private String username;
    @Column(columnDefinition = "varchar(60) comment '姓'")
    private String firstName;
    @Column(columnDefinition = "varchar(60) comment '名'")
    private String lastName;
    @Column(columnDefinition = "varchar(60) comment '电子邮箱'")
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
