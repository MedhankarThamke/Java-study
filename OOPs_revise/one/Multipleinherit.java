package OOPs_revise.one;

public class Multipleinherit {
    public static void main(String args[]) {
        Bear b = new Bear();
        b.eatsMeat();
        b.eatsPlants();
    }
}

interface Herbivore {

    void eatsPlants();

}

interface Carnivore {
    void eatsMeat();
}

class Bear implements Herbivore, Carnivore {
    static String bearbreed = "grizzly bear";

    public void eatsMeat() {
        System.out.println("eat meat");
    }

    public void eatsPlants() {
        System.out.println("eats plants");
    }
}