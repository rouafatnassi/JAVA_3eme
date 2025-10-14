package Prosite4.tn.esprit.gestionZoo.entites;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
        super();
    }


    public Aquatic(String family, boolean isMammal, int age, String name, String habitat) {
        super(family, isMammal, age, name);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }



    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;

        Aquatic other = (Aquatic) obj;
        return this.getName().equals(other.getName())
                && this.getAge() == other.getAge()
                && this.habitat.equals(other.habitat);
    }


}