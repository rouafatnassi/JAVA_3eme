package Prosit2;

public class Test {
    public static void main(String[] args) {

        Animal lion = new Animal("unLion", true, 20, "Lion");
        Animal chat = new Animal("unChat", true, 2, "Timo");
        Animal chien = new Animal("unChien", true, 1, "Cookie");
        Animal giraffe= new Animal();
        giraffe.age=5;
        giraffe.name="coco";
        giraffe.family="uneGiraffe";
        giraffe.isMammal=true;


        Zoo zoo = new Zoo();
        zoo.nbrCages=20;
        zoo.name="Esprit";
        zoo.city="Ariana";
        zoo.addAnimal(lion);
        zoo.addAnimal(chat);
        zoo.addAnimal(chien);
        zoo.addAnimal(giraffe);
        //System.out.println(zoo) ;
        System.out.println(zoo.toString());


    }
}
