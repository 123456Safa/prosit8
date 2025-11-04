package org.example;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(2, "safa", "baalouch", "IT", 2);
        Employe e2 = new Employe(3, "mayssa", "baalouch", "RH", 3);
        Employe e3 = new Employe(1, "Mouna", "baalouch", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        societe.displayEmploye();

        societe.trierEmployeParId();
        societe.displayEmploye();

        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();


        for (Employe e : societe.rechercherParDepartement("IT")) {
            System.out.println(e);
        }
    }
}
