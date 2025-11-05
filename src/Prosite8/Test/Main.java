package Prosite8.Test;

import Prosite8.Entity.Employe;
import Prosite8.Entity.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ali", "Ben Salah", "RH", 2);
        Employe e2 = new Employe(1, "Sami", "Trabelsi", "IT", 3);
        Employe e3 = new Employe(2, "Hana", "Gharbi", "IT", 1);
        Employe e4 = new Employe(4, "Noura", "Ayadi", "Finance", 2);

        // Ajout
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("=== Liste initiale ===");
        societe.displayEmploye();

        // Recherche
        System.out.println("\nRecherche par nom 'Ali' : " + societe.rechercherEmploye("Ali"));

        // Tri naturel (id)
        societe.trierEmployeParId();
        System.out.println("\n=== Tri par ID ===");
        societe.displayEmploye();

        // Tri par Département + Grade + Nom
        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\n=== Tri par Département, Grade et Nom ===");
        societe.displayEmploye();

        // Recherche avancée
        System.out.println("\n=== Employés du département IT ===");
        for (Employe e : societe.rechercherParDepartement("IT")) {
            System.out.println(e);
        }
    }
}