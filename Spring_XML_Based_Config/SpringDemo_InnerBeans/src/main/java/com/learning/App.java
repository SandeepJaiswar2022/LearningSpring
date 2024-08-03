package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* Inner Beans :
Basically we create a particular bean inside a bean
it is created for specific bean only inside the <property> tag of the <bean> tag
it means, it is not available for other beans except the bean inside which it is created
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Alien alien = context.getBean("alien", Alien.class);
        alien.code();

    }
}
