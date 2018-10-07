package ru.geekbrains.dz1.leonov.vyacheslav;

public class Water extends Obstacle {
    int lenght;

    public Water(int lenght) {
        this.lenght = lenght;
    }

    @Override
    void doIt(Competitor competitor) {
        competitor.swim(lenght);
    }
}
