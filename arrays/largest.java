package arrays;

// import java.util.*;

public class largest {
    public static int largestNo(int marks[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                // System.out.println(max);
                max = marks[i];
            }
            if (marks[i] < min) {
                min = marks[i];
            }

        }
        System.out.println("smallest is " + min);
        return max;

    }

    public static void main(String args[]) {
        int marks[] = { 1, 4, 8, 9, 2 };
        System.out.println(largestNo(marks));
    }
}
