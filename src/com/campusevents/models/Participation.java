package com.campusevents.models;

public class Participation {
    public void participer(Utilisateur user, Evenement ev) {
        System.out.println(user.nom + " participe à " + ev.titre);
    }
}
