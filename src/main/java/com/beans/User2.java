package com.beans;

/**
 * @program: an
 * @description:
 * @author: SANJIU HUANG
 * @create: 2021-05-20 10:48
 **/
public class User2 {
    private int id ;
    private int age ;
    private int sex ;
    private int state ;
    private String name;
    private String pass;
    private String lastUP;

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                ", age=" + age +
                ", sex=" + sex +
                ", state=" + state +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", lastUP='" + lastUP + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getLastUP() {
        return lastUP;
    }

    public void setLastUP(String lastUP) {
        this.lastUP = lastUP;
    }
}
