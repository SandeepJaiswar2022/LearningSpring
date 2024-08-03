package com.learning;

import com.learning.JavaConfig.JavaConfigApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
Now we are going to configure our spring project using javaBasedConfiguration
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigApp.class);
        Alien alien = context.getBean("alien", Alien.class);
        alien.code();
    }
}
