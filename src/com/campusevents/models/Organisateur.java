package com.campusevents.models;

public class Organisateur extends Utilisateur {

    public Organisateur(String nom, String email) {
        super(nom, email);
    }

    public void creerEvenement() {
        System.out.println("Organisateur a créé un événement");
    }
}