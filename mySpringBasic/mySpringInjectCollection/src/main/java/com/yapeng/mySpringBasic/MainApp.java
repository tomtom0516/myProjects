package com.yapeng.mySpringBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans01.xml");
        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
