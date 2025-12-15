package Prosite10;

public class Departement {
    private int id;
    private String nom;

    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{id=" + id + ", nom='" + nom + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement)) return false;
        Departement d = (Departement) o;
        return id == d.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
