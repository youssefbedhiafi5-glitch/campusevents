package com.campusevents.models;


public class main {
    public static void main(String[] args) {

        Utilisateur user = new Utilisateur("Sami", "sami@mail.com");

        user.modifierProfil("Eya");
        user.modifierProfil("");
        user.modifierProfil(null);
    }
}
