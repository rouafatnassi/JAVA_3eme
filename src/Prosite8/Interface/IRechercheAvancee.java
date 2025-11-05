package Prosite8.Interface;

import java.util.List;

public interface IRechercheAvancee <T> {
    List<T> rechercherParDepartement(String nomDepartement);
}