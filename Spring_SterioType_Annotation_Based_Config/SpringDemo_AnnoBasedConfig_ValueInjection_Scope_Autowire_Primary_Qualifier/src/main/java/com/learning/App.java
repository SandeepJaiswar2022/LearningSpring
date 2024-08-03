package com.learning;

import com.learning.AppConfigs.AnnotationAppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();
    }
}
