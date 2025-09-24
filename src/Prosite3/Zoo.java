package Prosite3;



import java.util.Arrays;

public class Zoo {

 Animal[] animals = new Animal[nbrCages];
   String name;
   String city;
    private static final int nbrCages=25;
    private int animalCount = 0;


    public Zoo(String city, String name) {
        this.city = city;
        this.name = name;
    }



    public boolean addAnimal(Animal a) {
        if (isZooFull()) {
            System.out.println("Impossible d’ajouter " + a.name+ " : le zoo est plein !");
            return false;
        }
        if (searchAnimal(a) != -1) {
            System.out.println("L’animal " + a.name + " existe déjà dans le zoo !");
            return false;
        }
        animals[animalCount] = a;
        animalCount++;
        return true;
    }


        public void displayZoo(){
            System.out.println("le nom du zoo "+this.name+" nbr cages "+this.nbrCages+" ville : "+ this.city);

        }


    public void displayAnimals() {
        System.out.println("Liste des animaux du zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }


    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }


    public int searchAnimal(Animal a) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(a.name)) {
                return i;
            }
        }
        return -1;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount >= z2.animalCount) ? z1 : z2;
    }



    public boolean removeAnimal(Animal a) {
        int index = searchAnimal(a);
        if (index == -1) {
            System.out.println("L’animal " + a.name + " n’existe pas dans le zoo.");
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }





    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}

