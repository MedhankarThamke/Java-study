package two_d_arrays;

import java.util.*;

public class basic {
    public static boolean search(int nums[][], int key) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == key) {
                    System.out.println("key found at (" + i + "," + j + ")");
                    return true;
                }

            }
        }
        System.out.println("key not found ");
        return false;
    }

    public static boolean largest(int nums[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];
                }

            }
            System.out.println();
        }
        System.out.println("largest no from the matrix is=" + max);
        search(nums, max);
        return false;
    }

    public static boolean smallest(int nums[][]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] < min) {
                    min = nums[i][j];
                }

            }
        }
        System.out.println("smallest no from the matrix is=" + min);
        search(nums, min);
        return false;
    }

    public static void main(String args[]) {
        int two_d[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int row = two_d.length, columns = two_d[0].length;

        // input

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                two_d[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(two_d[i][j] + " ");
            }
            System.out.println();
        }
        largest(two_d);
        smallest(two_d);
        sc.close();
    }
}
