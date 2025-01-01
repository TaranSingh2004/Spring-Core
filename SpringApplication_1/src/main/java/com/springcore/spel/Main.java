package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config_spel.xml");
        Demo d1=context.getBean("demo", Demo.class);
        System.out.println(d1);
        SpelExpressionParser temp= new SpelExpressionParser();
        Expression expression= temp.parseExpression("11+22");
        System.out.println(expression.getValue());
    }
}
