package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Scope (1. Singleton(byDefault) 2. Prototype)
// Singleton => by default Beans(Objects) will be of type Singleton means
//              doesn't matter how many objects we create by calling getBean()
//              all will refer to the same object.

// Prototype => every time when we call getBean,the new Object will be created.
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Alien alien1 = (Alien)context.getBean("alienObject");
        alien1.setAge(23);
        System.out.println(alien1.getAge());
        // alien.code();

        Alien alien2 = (Alien)context.getBean("alienObject");
        System.out.println(alien2.getAge());

        // alien.code();
    }
}
