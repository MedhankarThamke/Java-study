package recursion;

public class Basic {
    public static void PrintDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        PrintDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int factNM1 = fact(n - 1);
        int factN = n * factNM1;
        return factN;
    }

    public static int sumN(int n) {
        if (n == 1) {
            return 1;
        }
        int sumNM = sumN(n - 1);
        int sumN = n + sumNM;
        return sumN;
    }

    public static int fibN(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibNM1 = fibN(n - 1);
        int fibNM2 = fibN(n - 2);
        int fibN = fibNM1 + fibNM2;
        return fibN;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOcr(int arr[], int num, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == num) {
            return i;
        }
        return firstOcr(arr, num, i + 1);
    }

    public static int lastOcr(int arr[], int num, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcr(arr, num, i + 1);
        if (isFound == -1 && arr[i] == num) {
            return i;
        }
        return isFound;
    }

    public static int powerN(int n, int i) {
        if (i == 0) {
            return 1;
        }
        return n * powerN(n, i - 1);
    }

    public static int optiPower(int n, int i) {
        if (i == 0) {
            return 1;
        }
        int halfPower = optiPower(n, i / 2);
        int halfPowerSq = halfPower * halfPower;
        if (i % 2 != 0) {
            halfPowerSq = n * halfPowerSq;
        }
        return halfPowerSq;

    }

    public static void main(String[] args) {
        // int n = 20;
        // // PrintDec(n);
        int num[] = { 1, 2, 3, 4, 1, 5, 6 };
        System.out.println(lastOcr(num, 1, 0));
        // System.out.println(isSorted(num, 0));
        // System.out.println(optiPower(2, 10));
        // System.out.println(powerN(2, 10));
    }
}
