package ru.geekbrains.dz1.leonov.vyacheslav;

public class Animal implements Competitor {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно пробежал дистанцию.");
        } else {
            System.out.println(type + " " + name + " не смог пробежать дистанцию.");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " успешно перепрыгнул препятствие.");
        } else {
            System.out.println(type + " " + name + " не перепрыгнул препятствие.");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно проплыл дистанцию.");
        } else {
            System.out.println(type + " " + name + " не смог проплыть дистанцию.");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        if (onDistance == true) {
            System.out.println(type + " " + name + " успешно завершил марафон." + "(" + onDistance + ")");
        } else {
            System.out.println(type + " " + name + " не сумел завершить марафон." + "(" + onDistance + ")");
        }
    }
}
