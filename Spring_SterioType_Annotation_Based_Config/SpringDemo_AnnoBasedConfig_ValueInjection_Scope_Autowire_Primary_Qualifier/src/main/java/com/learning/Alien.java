package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Alien {
    private int age;
    private Computer computer;
    public Alien() {
        System.out.println("Alien object created");
    }

    public int getAge() {
        return age;
    }
    @Value("34")
    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }
    @Autowired
    //@Qualifier("desktop") //By default bean name is i.e (class-> Desktop then BeanName-> desktop)
    @Qualifier("desk")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code()
    {
        System.out.print("Alien is coding ");
        computer.compile();
    }
}
