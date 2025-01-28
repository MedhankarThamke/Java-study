package OOPs;

public class Abstract {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    String skinColor;

    Animal() {
        skinColor = "Unknown";
    }

    void eats() {
        System.out.println("eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        skinColor = "white";
    }

    void walk() {
        System.out.println("wlaks on 4 legs");
    }
}

class Human extends Animal {
    void changeColor() {
        skinColor = "red";
    }

    void walk() {
        System.out.println("wlaks on 2 legs");
    }
}