package com.campusevents.models;

import java.util.ArrayList;

public class Recherche {

    public void afficherEvenements(ArrayList<Evenement> liste) {
        for (Evenement e : liste) {
            e.afficherDetails();
        }
    }

    public void rechercherParTitre(ArrayList<Evenement> liste, String mot) {
        for (Evenement e : liste) {
            if (e.titre.contains(mot)) {
                System.out.println("Trouvé: " + e.titre);
            }
        }
    }

    public void afficherEvenements() {
        System.out.println("Liste des événements");
    }

}

