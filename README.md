# 🎓 Campus Events

## 📌 Description
Campus Events est une application Java permettant aux étudiants de créer, rechercher et participer à des événements universitaires (clubs, stages, jobs, activités…).

---

## 🎯 Objectif
Faciliter la vie associative et sociale des étudiants en centralisant les événements du campus.

---

## 👥 Équipe

| Nom                     | Rôle Scrum       | Fonction principale        |
|------------------------|----------------|--------------------------|
| Eya-t-Allah Ghrairi    | Product Owner  | Gestion utilisateurs     |
| Youssef Bedhiafi       | Scrum Master   | Recherche & filtrage     |
| Rezgui Malak           | Développeur    | Gestion événements       |
| Adem Abassi            | Développeur    | Participation            |
| Ayoub Krifi            | Développeur    | Administration           |

---

## ⚙️ Fonctionnalités

### 🔐 1. Utilisateur
- Inscription
- Connexion
- Modification du profil

### 📅 2. Événements
- Création d’événements
- Modification
- Annulation

### 🔍 3. Recherche
- Recherche par titre
- Filtrage par lieu
- Filtrage des événements actifs

### 👥 4. Participation
- Participation à un événement
- Vérification de capacité
- Blocage si événement annulé

### 🛠️ 5. Administration
- Validation d’événements
- Suppression
- Blocage utilisateur
- Dashboard (statistiques)

---

## 🧠 Architecture

Le projet est structuré en plusieurs classes :

- `Utilisateur`
- `Organisateur`
- `Evenement`
- `Participation`
- `Recherche`
- `Administrateur`
- `Main`

---

## 🚀 Exécution

### Compilation
```bash
javac src/com/campusevents/models/*.java
