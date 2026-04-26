package com.campusevents.models;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        // 1. Organisateur
        Organisateur org = new Organisateur("Ali", "ali@mail.com");
        org.creerEvenement();

        // 2. Création événement
        Evenement ev1 = new Evenement("Hackathon", "2026-05-10", "ESPRIT");
        Evenement ev2 = new Evenement("Stage Info", "2026-06-01", "INSAT");

        // 3. Liste événements
        ArrayList<Evenement> liste = new ArrayList<>();
        liste.add(ev1);
        liste.add(ev2);

        // 4. Recherche
        Recherche r = new Recherche();
        r.afficherEvenements(liste);
        r.rechercherParTitre(liste, "Hack");

        // 5. Utilisateur
        Utilisateur user = new Utilisateur("Sami", "sami@mail.com");
        user.sInscrire();
        user.seConnecter();

        // 6. Participation
        Participation p = new Participation();
        p.participer(user, ev1);

        // 7. Admin
        Administrateur admin = new Administrateur();
        admin.validerEvenement(ev1);
    }
}