package Prosit2;

public class Animal {

    String family;
    String name;
    int age;
    boolean isMammal;


    public Animal(String family, boolean isMammal, int age, String name) {
        this.family = family;
        this.isMammal = isMammal;
        this.age = age;
        this.name = name;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
