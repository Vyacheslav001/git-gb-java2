package ru.geekbrains.dz2.leonov.vyacheslav.dopDz;

public class Main {

    public static void main(String[] args) {
        counterWorkHours(Week.SATURDAY);
    }

    public static void counterWorkHours(Week week) {
        int workweek = 0;
        for (Week w : Week.values()) {
            workweek += w.getWorkHours();
            if (week == w) break;
        }
        if (week == Week.SUNDAY || week == Week.SATURDAY) {
            System.out.println("Сегодня выходной!");
        } else {
            System.out.println(workweek);
        }
    }
}
