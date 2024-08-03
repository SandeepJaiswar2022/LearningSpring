package com.learning;

public class Alien {
    private Computer computer;
    private int id;

    public Alien() {
        System.out.println("Alien object created");
    }
    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void code()
    {
        System.out.println("Alien is coding ");
    }
}
