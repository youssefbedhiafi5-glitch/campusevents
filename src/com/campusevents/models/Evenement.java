package com.campusevents.models;

public class Evenement {

    String titre;
    String date;
    String lieu;

    String statut;
    int capacite;
    int participants;

    public Evenement(String titre, String date, String lieu) {
        this.titre = titre;
        this.date = date;
        this.lieu = lieu;
        this.statut = "ACTIF";
        this.capacite = 3;
        this.participants = 0;
    }

    System.out.println("Événement: " + titre + " | " + date + " | " + lieu
        + " | statut: " + statut
        + " | places: " + participants + "/" + capacite);

    public void modifierEvenement(String nouveauTitre, String nouveauLieu) {

    if (statut.equals("ANNULE")) {
        System.out.println("Impossible de modifier un événement annulé");
        return;
    }

    if (nouveauTitre == null || nouveauTitre.trim().isEmpty()) {
        System.out.println("Titre invalide");
        return;
    }

    this.titre = nouveauTitre;
    this.lieu = nouveauLieu;

    System.out.println("Événement modifié");
}

public void annulerEvenement() {
    this.statut = "ANNULE";
    System.out.println(" Événement annulé");
}


}
