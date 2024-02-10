package com.javarush.task.task19.task1921;

public class Hdd {

    String name;
    int volume;
    String type;

    public Hdd() {
    }

    public Hdd(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "hdd{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}