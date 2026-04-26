package com.campusevents.models;

public class Administrateur {

public void validerEvenement(Evenement ev) {
        System.out.println("Admin valide l'événement: " + ev.titre);
    }
public void validerEvenement(String event) {
        System.out.println("Admin valide : " + event);
    }
}