package functions;

public class pytTriplet {
    public static void isTrip(int a, int b, int c) {
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        System.out.println(a + " sqaure is " + a2);
        System.out.println(b + " sqaure is " + b2);
        System.out.println(c + " sqaure is " + c2);
        if ((a2 + b2) == c2) {
            System.out.println(a2 + "+" + b2 + "=" + c2);
            System.out.println("is pythagorus triplet");
        } else {
            System.out.println(a2 + "+" + b2 + "!=" + c2);
            System.out.println("is not pythagorus triplet");

        }
    }

    public static void main(String[] args) {
        isTrip(3, 4, 9);
    }

}