package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
//Autowiring (It is attribute of bean tag to map(wire) with other beans

autowire("byName") => it means class property name should be same as the bean name then it will pick that bean

autowire("byType") => it will search for type of beans and choose the type of bean which has the same type as properties of class(which will be injected through setters)

primary => when there is two or more beans with same type and we are autowiring through "bytype" then it is necessary to mention one of them as "primary" otherwise compiler will get confused.

* */

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Alien alien = context.getBean("alien",Alien.class);
        alien.code();
        System.out.println(alien.getId());
    }
}
