package functions;

import java.util.*;

public class binCoefficient {
    public static int binCo(int n, int r) {
        int nFact = fact(n);
        int rFact = fact(r);
        int nmrFact = fact(n - r);
        int result = nFact / (rFact * nmrFact);
        return result;

    }

    public static int fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number & r =");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binCo(n, r));
        sc.close();
        return;

    }

}
