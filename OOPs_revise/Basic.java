package OOPs_revise;

import java.util.*;

public class Basic {
    public static int sumOfElement(int newArr[]) {
        int sum = 0;
        for (int i = 0; i < newArr.length; i++) {
            sum += newArr[i];
        }
        return sum;
    }

    public static int binarySearch(int sortedArr[], int key) {
        int start = 0, end = sortedArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key < sortedArr[mid]) {
                end = mid - 1;
            } else if (key > sortedArr[mid]) {
                start = mid + 1;
            } else if (key == sortedArr[mid]) {
                return mid;
            }
        }
        return -1;

    }

    public static void reverseArr(int newArr[]) {
        int start = 0, end = newArr.length - 1;
        while (start < end) {
            int temp = newArr[start];
            newArr[start] = newArr[end];
            newArr[end] = temp;
            start++;
            end--;
        }

    }

    public static void subArray(int newArr[]) {
        for (int i = 0; i < newArr.length; i++) {

            for (int j = i; j < newArr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(newArr[k] + " ");
                }
                System.out.println();
            }
            System.out.println("---------------");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int newNum = sc.nextInt();

        String str = "medhankar";
        // System.out.println(str.length());

        int[] newArr = new int[5];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = sc.nextInt();
        }
        // System.out.println(sumOfElement(newArr));

        int[] sortedArr = { 1, 2, 3, 4, 5, 6, 7 };
        // lets try binary search
        System.out.println(binarySearch(sortedArr, 6));
        // reverseArr(newArr);
        // System.out.println(newArr);
        subArray(newArr);
    }
}
