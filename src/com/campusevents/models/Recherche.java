package com.campusevents.models;

import java.util.ArrayList;

public class Recherche {

    // Afficher tous les événements
    public void afficherEvenements(ArrayList<Evenement> liste) {
        for (Evenement e : liste) {
            e.afficherDetails();
        }
    }

    // Recherche intelligente par titre
    public void rechercherParTitre(ArrayList<Evenement> liste, String motCle) {

        boolean trouve = false;

        for (Evenement e : liste) {

            // ignore majuscules + recherche partielle
            if (e.titre.toLowerCase().contains(motCle.toLowerCase())) {
                e.afficherDetails();
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun événement trouvé pour : " + motCle);
        }
    }


    public void filtrerParLieu(ArrayList<Evenement> liste, String lieu) {

        boolean trouve = false;

        for (Evenement e : liste) {
            if (e.lieu.equalsIgnoreCase(lieu)) {
                e.afficherDetails();
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun événement trouvé pour ce lieu");
        }
    }


    public void filtrerEvenementsActifs(ArrayList<Evenement> liste) {

        boolean trouve = false;

        for (Evenement e : liste) {
            if (e.statut.equals("ACTIF")) {
                e.afficherDetails();
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun événement actif");
        }
    }
}

