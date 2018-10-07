package ru.geekbrains.dz1.leonov.vyacheslav;

public class Human implements Competitor {

    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean active;

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 300;
        this.maxSwimDistance = 200;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " успешно пробежал дистанцию.");
        } else {
            System.out.println(name + " не смог пробежать дистанцию.");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул препятствие.");
        } else {
            System.out.println(name + " не перепрыгнул препятствие.");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(name + " успешно проплыл дистанцию.");
        } else {
            System.out.println(name + " не смог проплыть дистанцию.");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        if (active == true) {
            System.out.println(name + " " + " успешно завершил марафон." + "(" + active + ")");
        }else {
            System.out.println(name + " " + " не сумел завершить марафон." + "(" + active + ")");
        }
    }
}
