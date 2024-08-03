package com.learning.JavaConfig;

import com.learning.Alien;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public Alien alien()
    {
        return new Alien();
    }
}
