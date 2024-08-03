package com.learning;

public class Alien {
    private int age;
    private Laptop lap;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge(setter) called");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        System.out.println("setLap(setter) called");
        this.lap = lap;
    }

    public void code()
    {
        System.out.print("Alien is Coding ");
        lap.compile();
    }
}

