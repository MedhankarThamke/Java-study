package loops;

import java.util.*;

public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println("num is prime");
        } else {
            System.out.println("num is not prime");
        }
        sc.close();

    }
}
