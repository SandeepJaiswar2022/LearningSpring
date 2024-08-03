package com.learning.JavaConfigFiles;

import com.learning.Alien;
import com.learning.Computer;
import com.learning.Desktop;
import com.learning.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean
    //By default alien() this name would be the bean name else we can rename it by using @Bean(name="") attribute
    //@Qulifier("desktop") is same as we used to do in xml configuration <property name="computer" ref="BeanName">
    public Alien alien(@Autowired @Qualifier("desktop") Computer computer) //@Autowired is optional
    {
        Alien alien = new Alien();
        alien.setAge(37);
        alien.setComputer(computer);
        return alien;
    }
    @Bean
    public Desktop desktop()
    {
        return new Desktop();
    }
    @Bean
    @Primary
    public Laptop laptop()
    {
        return new Laptop();
    }
}
