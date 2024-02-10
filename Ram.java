package com.javarush.task.task19.task1921;

public class Ram {

    String name;
    int volume;

    public Ram() {
    }

    public Ram(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "ram{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

}