package Prosit1;

public class ZooManagement {
    public int nbrCages;
    public String zooName ;


    public ZooManagement(int nbrCages, String zooName) {
        this.nbrCages = nbrCages;
        this.zooName = zooName;
    }

    @Override
    public String toString() {
        return zooName + " comporte " + nbrCages + " cages";
    }
}

