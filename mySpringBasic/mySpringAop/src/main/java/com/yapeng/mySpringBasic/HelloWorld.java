package com.yapeng.mySpringBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld
{
    public String sayHello()
    {
        System.out.println("hello world !");
        return "hello world!";
    }

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();

        Teacher teacher = (Teacher) context.getBean("teacher");
        teacher.getName();
        teacher.getAge();

        HelloWorld helloWord =new HelloWorld();
        helloWord.sayHello();

        student.printThrowException();

    }
}
