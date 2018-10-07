package ru.geekbrains.dz1.leonov.vyacheslav;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Champions", new Human("John"), new Duck("Donald"), new Cat("Vaska"), new Dog("Bobik"));
        Course course = new Course(new Cross(80), new Wall(5), new Water(100));

        course.doIt(team1);
        team1.infoFinish();
    }
}
