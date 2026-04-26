package com.campusevents.models;


public class main {
    public static void main(String[] args) {

        Evenement ev = new Evenement("Hackathon", "2026", "ESPRIT");
        ev.afficherDetails();
        ev.modifierEvenement("Workshop Java", "Salle B");
        ev.annulerEvenement();

        // test important
       ev.modifierEvenement("Test", "Salle C");

        ev.afficherDetails();
    }
    
}
