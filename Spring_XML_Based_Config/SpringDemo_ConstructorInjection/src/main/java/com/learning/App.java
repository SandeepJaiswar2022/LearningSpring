package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 ==>> Constructor Injection(Nothing but we are initializing the class variables by injecting value through constructor

 How to implement it :=
 We can use <constructor-arg></constructor-arg> tag of <bean></bean> tag to inject the value

 It can be of two type :=
 VALUE => For primitive variables
 REF   => For reference variables

 Imp Attribute of <constructor-arg></constructor-arg> :=

 INDEX => we can specify on which index which value should be assigned.



 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Alien alien = (Alien)context.getBean("alien");
        System.out.println("Alien age : "+alien.getAge());
        System.out.println("Alien id  : "+alien.getId());
        alien.code();
    }
}
