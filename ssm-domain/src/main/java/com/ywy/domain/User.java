package com.ywy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private Integer uuid;
    private String userName;
    private String password;
    private String realName;
    private Integer gender;
    @DateTimeFormat(pattern = "YYYY-MM-dd HH:mm:ss") // 读取前端日期参数的格式化
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss", timezone="GMT+8") // 返回给前端的日期格式化
    private Date birthday;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
