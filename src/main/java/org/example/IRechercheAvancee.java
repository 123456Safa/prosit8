package org.example;

import java.util.List;

public interface IRechercheAvancee<T> {
    List<T> rechercherParDepartement(String nomDepartement);
}
