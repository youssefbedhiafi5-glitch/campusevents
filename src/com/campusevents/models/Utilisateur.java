package com.campusevents.models;

public class Utilisateur {
    String nom;
    String email;

    public Utilisateur(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }
    public void sInscrire() {
        System.out.println(nom + " est inscrit avec email " + email);
    }
    public void seConnecter() {
        System.out.println(nom + " est connecté");
    }
}
