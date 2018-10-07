package ru.geekbrains.dz1.leonov.vyacheslav;

public interface Competitor {
    void run(int dist);
    void jump(int height);
    void swim(int dist);
    boolean isOnDistance();
    void info();
}
