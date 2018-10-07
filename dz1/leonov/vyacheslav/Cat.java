package ru.geekbrains.dz1.leonov.vyacheslav;

public class Cat extends Animal {

    public Cat(String name) {
        super("Кот", name, 200, 10, 0);
    }

    @Override
    public void swim(int dist) {
        System.out.println("Котам не обязательно плавать!");
    }
}
