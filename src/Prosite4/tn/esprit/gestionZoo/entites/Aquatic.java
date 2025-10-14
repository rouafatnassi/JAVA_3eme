package Prosite4.tn.esprit.gestionZoo.entites;

public class Aquatic extends Animal {
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


    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

}