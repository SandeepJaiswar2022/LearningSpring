package com.learning;

import com.learning.JavaConfig.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 Scope

 by default it is "Singleton" means object will be created once and all the references will refer the same object
 @Scope("prototype") means every time when we call getBeans new object will be created.
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien alien1 = context.getBean(Alien.class);
        alien1.setAge(40);
        alien1.code();
        Alien alien2 = context.getBean(Alien.class);
        alien2.code();
    }
}
