package org.example;

import java.util.*;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private List<Employe> liste = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe t) {
        liste.add(t);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : liste) {
            if (e.getNom().equalsIgnoreCase(nom)) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe t) {
        return liste.contains(t);
    }

    @Override
    public void supprimerEmploye(Employe t) {
        liste.remove(t);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : liste) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(liste); // tri naturel via Comparable
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(liste, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int deptCompare = e1.getNomDepartement().compareToIgnoreCase(e2.getNomDepartement());
                if (deptCompare != 0) return deptCompare;

                int gradeCompare = Integer.compare(e1.getGrade(), e2.getGrade());
                if (gradeCompare != 0) return gradeCompare;

                return e1.getNom().compareToIgnoreCase(e2.getNom());
            }
        });
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();
        for (Employe e : liste) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                resultat.add(e);
            }
        }
        return resultat;
    }
}
