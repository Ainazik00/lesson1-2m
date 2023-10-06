package org.example;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        String[] commands = {"Сидеть", "Лежать"};
        Shelter shelter = new Shelter("Romashka", "Lenina 1");

        Dog dog = new Dog("Rex", "Ovcharka", commands, shelter, ColorEnum.BLACK);

        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("gav gav");

        Shelter secondLife = new Shelter("Titus", "Slobodskaya 292");

        Dog dog2 = new Dog("Titus", "Alabai", secondLife, ColorEnum.WHITE);

        System.out.println(dog2.getInfo());
        dog2.makeVoice();
        dog2.makeVoice("gav gav");
    }
}