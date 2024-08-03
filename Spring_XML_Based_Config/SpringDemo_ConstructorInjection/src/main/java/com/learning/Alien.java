package com.learning;

public class Alien {
    private int age;
    private int id;
    private Laptop lap;

    public Alien(int age, int id, Laptop lap) {
        System.out.println("Alien's Parameterized Constructor called");
        this.age = age;
        this.id = id;
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code()
    {
        System.out.print("Alien is coding ");
        lap.compile();
    }
}
