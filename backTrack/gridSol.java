package backTrack;

public class gridSol {
    public static int noOfSol(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
            // boundary condition
        }
        int w1 = noOfSol(i + 1, j, n, m);
        int w2 = noOfSol(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(noOfSol(0, 0, n, m));
        // time complexity of solution is 2^n+m
        // to get the linear complexity we can use the permutation which will be
        // ((n-1)+(m-1))!
        // --------------
        // (n)!(m)!
    }
}
