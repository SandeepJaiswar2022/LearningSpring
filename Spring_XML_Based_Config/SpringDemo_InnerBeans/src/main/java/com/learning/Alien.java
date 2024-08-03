package com.learning;

public class Alien {
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void code()
    {
        System.out.print("Alien is coding ");
        laptop.compile();
    }
}
