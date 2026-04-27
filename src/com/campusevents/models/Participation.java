package com.campusevents.models;

public class Participation {

    public void participer(Utilisateur user, Evenement ev) {

        // Vérification 1 : événement annulé
        if (ev.statut.equals("ANNULE")) {
            System.out.println("Impossible : événement annulé");
            return;
        }

        // Vérification 2 : capacité atteinte
        if (ev.participants >= ev.capacite) {
            System.out.println(" Impossible : événement complet");
            return;
        }

        // Logique métier : ajouter participant
        ev.participants++;

        System.out.println(""+ user.nom + " participe à " + ev.titre);
        System.out.println("Participants : " + ev.participants + "/" + ev.capacite);
    }
}