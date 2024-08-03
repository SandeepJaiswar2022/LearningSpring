package com.learning;

public class Alien {
    private int id;
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        System.out.println("setComputer called");
        this.computer = computer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("setId called");
        this.id = id;
    }

    public void code()
    {
        System.out.print("Alien is coding ");
        computer.compile();
    }
}
