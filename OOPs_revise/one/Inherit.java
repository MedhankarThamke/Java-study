package OOPs_revise.one;

public class Inherit {
    public static void main(String args[]) {
        Fish f1 = new Fish();
        f1.setFins(4);
        System.out.println(f1.getFins());
        f1.eats();
        Goldfish g1 = new Goldfish();
        g1.fishName();
        g1.eats();

    }
}

class Animal {
    String color;

    void eats() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }

}

class Fish extends Animal {
    private int fins;

    void setFins(int fins) {
        this.fins = fins;
    }

    int getFins() {
        return this.fins;
    }
}

class Goldfish extends Fish {

    void fishName() {
        System.out.println("This is goldfish");
        System.out.println("this is multilevel inheritance");
    }
}