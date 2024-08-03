package com.learning;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Primary
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop object created");
    }
    public void compile()
    {
        System.out.println("using laptop....");
    }
}
