package Prosit2;

import java.util.Arrays;

public class Zoo {

    Animal[] animals = new Animal[25];
   String name;
   String city;
    int nbrCages;


        public boolean addAnimal(Animal a) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = a;
                    return true;
                }
            }
            return false;
        }

        public void displayZoo(){
            System.out.println("le nom du zoo "+this.name+" nbr cages "+this.nbrCages+" ville : "+ this.city);

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

