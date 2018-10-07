package ru.geekbrains.dz1.leonov.vyacheslav;

import ru.geekbrains.dz1.leonov.vyacheslav.*;

public class Team {
    private String name;
    Competitor[] competitors;

    public Team(String name, Competitor... competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public void infoFinish() {
        for (Competitor c : competitors) {
            c.info();
        }
    }
}
