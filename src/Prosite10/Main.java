package Prosite10;

public class Main {
    public static void main(String[] args) {

        Employe e1 = new Employe(1, "Ali");
        Employe e2 = new Employe(2, "Sami");
        Employe e3 = new Employe(3, "Meriem");

        Departement d1 = new Departement(10, "Informatique");
        Departement d2 = new Departement(20, "RH");

        AffectationHashMap gestion = new AffectationHashMap();

        gestion.ajouterEmployeDepartement(e1, d1);
        gestion.ajouterEmployeDepartement(e2, d2);
        gestion.ajouterEmployeDepartement(e3, d1);

        // Tentative d'affectation multiple
        gestion.ajouterEmployeDepartement(e1, d2);

        System.out.println("\nListe des affectations :");
        gestion.afficherEmployesEtDepartements();

        System.out.println("\nListe des employés :");
        gestion.afficherEmployes();

        System.out.println("\nListe des départements :");
        gestion.afficherDepartements();

        System.out.println("\nRecherche employé e2 : " + gestion.rechercherEmploye(e2));
        System.out.println("Recherche département RH : " + gestion.rechercherDepartement(d2));

        System.out.println("\nEmployés triés par id :");
        gestion.trierMap().forEach((e, d) ->
                System.out.println(e + " --> " + d));
    }
}
