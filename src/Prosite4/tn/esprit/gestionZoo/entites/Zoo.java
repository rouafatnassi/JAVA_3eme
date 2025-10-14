package Prosite4.tn.esprit.gestionZoo.entites;



import java.util.Arrays;

public class Zoo {

    private static final int NBR_CAGES = 25;
    private Animal[] animals = new Animal[NBR_CAGES];
    private String name;
    private String city;
    private int animalCount = 0;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
    }


    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("⚠️ Le nom du zoo ne doit pas être vide. Valeur par défaut : 'Zoo Inconnu'.");
            this.name = "Zoo Inconnu";
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAnimalCount() {
        return animalCount;
    }


    public boolean addAnimal(Animal a) {
        if (isZooFull()) {
            System.out.println(" Impossible d’ajouter " + a.getName() + " : le zoo est plein !");
            return false;
        }

        if (searchAnimal(a) != -1) {
            System.out.println(" L’animal " + a.getName() + " existe déjà dans le zoo !");
            return false;
        }

        animals[animalCount++] = a;
        System.out.println( a.getName() + " ajouté avec succès au zoo " + name);
        return true;
    }

    private boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }

    public int searchAnimal(Animal a) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(a.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal a) {
        int index = searchAnimal(a);
        if (index == -1) {
            System.out.println("L’animal " + a.getName() + " n’existe pas dans le zoo.");
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--animalCount] = null;
        return true;
    }

    public void displayZoo() {
        System.out.println("🏛️ Zoo : " + name + " | Ville : " + city + " | Cages : " + NBR_CAGES);
    }

    public void displayAnimals() {
        System.out.println("🐾 Liste des animaux du zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount >= z2.animalCount) ? z1 : z2;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", animalCount=" + animalCount +
                ", NBR_CAGES=" + NBR_CAGES +
                '}';
    }
}

