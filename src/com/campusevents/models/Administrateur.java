package com.campusevents.models;

public class Administrateur {

    // Valider événement
    public void validerEvenement(Evenement ev) {
        if (ev == null) {
            System.out.println("Aucun événement à valider");
            return;
        }

        System.out.println("Événement validé : " + ev.titre);
    }

    // Supprimer événement
    public void supprimerEvenement(Evenement ev) {
        if (ev == null) {
            System.out.println("Aucun événement à supprimer");
            return;
        }

        System.out.println("Événement supprimé : " + ev.titre);
    }

    // Bloquer utilisateur
    public void bloquerUtilisateur(Utilisateur user) {
        if (user == null) {
            System.out.println("Utilisateur invalide");
            return;
        }

        System.out.println("Utilisateur bloqué : " + user.nom);
    }

    // Dashboard simple (important pour DS)
    public void afficherStats(int nbUsers, int nbEvents) {
        System.out.println("\nDashboard Admin");
        System.out.println("Utilisateurs : " + nbUsers);
        System.out.println(" Événements : " + nbEvents);
    }
}