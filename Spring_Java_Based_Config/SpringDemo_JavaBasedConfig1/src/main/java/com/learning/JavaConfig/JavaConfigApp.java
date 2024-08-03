package com.learning.JavaConfig;

import com.learning.Alien;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigApp {

    @Bean(name = "alien")
    public Alien getAlien()
    {
        return new Alien();
    }
}
