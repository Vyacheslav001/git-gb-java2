package ru.geekbrains.dz1.leonov.vyacheslav;

public class Wall extends Obstacle {
    int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
