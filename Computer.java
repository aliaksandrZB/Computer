package com.javarush.task.task19.task1921;

public class Computer {

    int price;
    String model;
    Ram ram;
    Hdd hdd;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new Ram("defaultRam", 15);
        this.hdd = new Hdd("defaultHdd", 16, "defaultHddType");
    }

    public Computer(int price, String model, Ram ram, Hdd hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", Hdd=" + hdd +
                '}';
    }
}