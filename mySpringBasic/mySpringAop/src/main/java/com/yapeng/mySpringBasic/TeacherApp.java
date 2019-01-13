package com.yapeng.mySpringBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherApp
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansTeacher.xml");
        Teacher teacher = (Teacher) context.getBean("teacher");
        teacher.getName();
        teacher.getAge();
    }
}
