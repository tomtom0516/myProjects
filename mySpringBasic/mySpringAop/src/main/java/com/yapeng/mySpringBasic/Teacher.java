package com.yapeng.mySpringBasic;

public class Teacher
{
    private String name;
    private Integer age;

    public String getName() {
        System.out.println("Teacher : " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        System.out.println("Age : " + age);
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
