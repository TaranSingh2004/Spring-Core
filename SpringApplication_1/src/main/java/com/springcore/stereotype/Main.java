package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("stereotype_config.xml");
        Student student = context.getBean("ob", Student.class);
        System.out.println(student);
        System.out.println(student.getAddress());
        System.out.println(student.getAddress().getClass().getName());
    }
}
