package com.javarush.task.task19.task1921;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name and volume ram");
        String ramName = sc.nextLine();
        int ramVolume = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name,type and volume Hdd");
        String hddName = sc.nextLine();
        String hddType = sc.nextLine();
        int hddVolume = sc.nextInt();

        Ram Ram = new Ram(ramName, ramVolume);
        Hdd Hdd = new Hdd(hddName, hddVolume, hddType);

        Computer pc1 = new Computer(1000, "asus");
        Computer pc2 = new Computer(1500, "hp", Ram, Hdd);

        System.out.println(pc1);
        System.out.println(pc2);
    }

}