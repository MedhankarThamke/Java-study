package patterns_2;
//        *      *

//        **    **
//        ***  ***
//        ********
//        ********
//        ***  ***
//        **    **
//        *      *

public class butterfly {
    public static void butterFly(int line) {

        // 1st half
        for (int i = 1; i <= line; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int space = 1; space <= (2 * line - 2 * i); space++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half we need too mirror image this so
        // just change the outer loop condition
        for (int i = line; i >= 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int space = 1; space <= (2 * line - 2 * i); space++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        butterFly(4);
    }
}
