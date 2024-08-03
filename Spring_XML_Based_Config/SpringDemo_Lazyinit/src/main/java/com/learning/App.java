package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* Lazy Init :
=> By default all objects/Beans will be created if IOC container even if we are not calling it or using it
=> If we have lots of Beans, and we are calling or using only few of them, then our code will load slowly
 Here comes the concept of Lazy Init it is an attribute of <bean></bean>
 It means on which Beans Lazy Init is mentioned all of them will not be created unless they are not called or some beans are not dependent on them.

 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Alien alien = context.getBean("alien",Alien.class);
        System.out.println(alien.getId());
        alien.code();
    }
}
