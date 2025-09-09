package EX1;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        ZooManagement zoo = new ZooManagement(20,"my Zoo");
        System.out.println(zoo);




        Scanner s = new Scanner(System.in);
        System.out.println("donner le nombre des cages :");
        int nbrcages = s.nextInt();
        s.nextLine();
        System.out.println("donner le nom du zoo :");
       String nomzoo = s.nextLine();
        ZooManagement ZOO = new ZooManagement(nbrcages,nomzoo);
        System.out.println(ZOO);
    }
}