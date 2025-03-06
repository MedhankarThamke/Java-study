package OOPs_revise.one;

// super keyword 
public class Abstraction {
    public static void main(String args[]) {
        Constructionvehicle c1 = new Constructionvehicle();
        Trains t2 = new Trains();
        c1.whereDoesItRun();
        c1.typeOfVehicle();
        t2.whereDoesItRun();
        t2.typeOfVehicle();
    }

}

abstract class Roadtransport {
    static String country = "India";

    void whereDoesItRun() {
        System.out.println("runs on road");
    }

    abstract void typeOfVehicle();
}

class Constructionvehicle extends Roadtransport {
    void typeOfVehicle() {
        System.out.println("used for construction business!!!");
        System.out.println(super.country);
    }
}

class Trains extends Roadtransport {
    void typeOfVehicle() {
        System.out.println("Runs on rail..");
    }
}