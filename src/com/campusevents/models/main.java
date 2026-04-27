package com.campusevents.models;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        feature/search
        System.out.println("=== Campus Events — Démonstration Finale ===");

        // =========================

        System.out.println("=== Campus Events — Sprint 2 ===");

        main
        
        Organisateur org = new Organisateur("Ali", "ali@mail.com");
        org.creerEvenement();

        
        // 2. Création événements
        
        Evenement ev1 = new Evenement("Hackathon", "2026-05-10", "ESPRIT");
        Evenement ev2 = new Evenement("Stage Info", "2026-06-01", "INSAT");
        Evenement ev3 = new Evenement("Football Match", "2026-07-01", "ESPRIT");

        
        // 3. Liste événements
        
        ArrayList<Evenement> liste = new ArrayList<>();
        liste.add(ev1);
        liste.add(ev2);
        liste.add(ev3);

        
        // 4. Recherche (Youssef)
        
        Recherche r = new Recherche();

        System.out.println("\n🔍 Recherche par titre 'Hack':");
        r.rechercherParTitre(liste, "Hack");

        System.out.println("\n📍 Filtrer par lieu 'ESPRIT':");
        r.filtrerParLieu(liste, "ESPRIT");

        System.out.println("\n✅ Événements actifs:");
        r.filtrerEvenementsActifs(liste);

        // =========================
        // 5. Utilisateur (Eya)
        // =========================
        Utilisateur user = new Utilisateur("Sami", "sami@mail.com");
        user.sInscrire();
        user.seConnecter();

        // modification profil
        user.modifierProfil("Sami Updated");

        // =========================
        // 6. Participation (Adem)
        // =========================
        System.out.println("\n=== Participation ===");

        Participation p = new Participation();

        p.participer(user, ev1);
        p.participer(user, ev1);
        p.participer(user, ev1);
        p.participer(user, ev1); // complet

        // =========================
        // 7. Gestion événement (Malak)
        // =========================
        System.out.println("\n=== Gestion Événement ===");

        ev1.afficherDetails();

        ev1.modifierEvenement("Workshop Java", "Salle B");

        ev1.annulerEvenement();

        // test modification après annulation
        ev1.modifierEvenement("Test", "Salle C");

        ev1.afficherDetails();

        // =========================
        // 8. Participation après annulation
        // =========================
        p.participer(user, ev1);

        // =========================
        // 9. Administration (Ayoub)
        // =========================
        System.out.println("\n=== Administration ===");

        Administrateur admin = new Administrateur();

        admin.validerEvenement(ev1);
        feature/search
        admin.supprimerEvenement(ev2);
        admin.bloquerUtilisateur(user);

        admin.afficherStats(5, 3);

        System.out.println("\n=== Fin démonstration ===");


        System.out.println("\n=== Test Evenement (Malak) ===");

        ev1.afficherDetails();

        // Modification
        ev1.modifierEvenement("Workshop Java", "Salle B");

        // Annulation
        ev1.annulerEvenement();

        // Test important : modification après annulation
        ev1.modifierEvenement("Test", "Salle C");

        // Affichage final
        ev1.afficherDetails();
        main
    }
}

