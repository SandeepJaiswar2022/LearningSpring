package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 Learning About Setter Injection.

 Setter Injection => We inject or initialize the properties(variables) of class
                     using its setter
 how to do it     => there is <property></property> tag inside the <bean></bean>
                     tag we define values in this property tags for the class properties
 Types of Setter Injection :
 1. value := if variable is of primitive type then we use "value" attribute of property tag
 2. ref := if variable is of reference type then we use "ref" attribute of property tag,
           we have to make sure that whichever(Bean) we are referring to that must have present already


 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Alien alien = context.getBean("alien",Alien.class);
        System.out.println(alien.getAge());
        alien.code();
    }
}
