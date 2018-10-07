package ru.geekbrains.dz1.leonov.vyacheslav;

public class Cross extends Obstacle {
    int lenght;

    public Cross(int lenght) {
        this.lenght = lenght;
    }

    @Override
    void doIt(Competitor competitor) {
        competitor.run(lenght);
    }
}