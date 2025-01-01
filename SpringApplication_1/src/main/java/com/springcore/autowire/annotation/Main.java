package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoconfig_annotation.xml");
        Emp emp1 = context.getBean("emp1", Emp.class);
        System.out.println(emp1);
    }
}
