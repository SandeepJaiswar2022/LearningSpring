package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 1. Initially add Spring context dependency to pom.xml

 2. We have to create ApplicationContext which means we are creating IOC(Inversion of control) container.
    IOC => Inversion of control means we(before spring programmers were responsible for
    creating and managing the object) are transferring our control of object
    creation and management to the Spring Framework
 3. Then we have to perform DI(dependency injection) means getting the object(or Bean) created be Spring
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //By ApplicationContext we got the IOC container
        Alien alien = context.getBean("alien", Alien.class);
        alien.code();
    }
}
