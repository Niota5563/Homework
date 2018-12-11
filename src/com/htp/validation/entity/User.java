package com.htp.validation.entity;

public class User {
    private String name;
    private String login;
    private String password;
    private int age;
    private ExceptionSexEnum sex;

    public User() {
    }

    public User(String name, String login, String password, int age, ExceptionSexEnum sex) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ExceptionSexEnum getSex() {
        return sex;
    }

    public void setSex(ExceptionSexEnum sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

