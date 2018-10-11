package ru.geekbrains.dz2.leonov.vyacheslav.dopDz;

public enum Week {
    SUNDAY("Воскресенье", 0),
    SATURDAY("Суббота", 0),
    FRIDAY("Пятница", 8),
    THURSDAY("Четверг", 8),
    WEDNESDAY("Среда", 8),
    TUESDAY("Вторник", 8),
    MONDAY("Понедельник", 8);

    Week(String name, int workHours) {
        this.name = name;
        this.workHours = workHours;
    }

    private String name;
    private int workHours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
