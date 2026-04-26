package com.campusevents.models;

public class Evenement {
    String titre;
    String date;
    String lieu;

    public Evenement(String titre, String date, String lieu) {
        this.titre = titre;
        this.date = date;
        this.lieu = lieu;
    }

    public void afficherDetails() {
        System.out.println("Événement: " + titre + " | " + date + " | " + lieu);
    }
}