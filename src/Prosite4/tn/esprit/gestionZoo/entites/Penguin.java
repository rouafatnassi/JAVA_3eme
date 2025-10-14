package Prosite4.tn.esprit.gestionZoo.entites;


public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() {
        super();
    }


    public Penguin(String family, boolean isMammal, int age, String name, String habitat, float swimmingDepth) {
        super(family, isMammal, age, name, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }
}