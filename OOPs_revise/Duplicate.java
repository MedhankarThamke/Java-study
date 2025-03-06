package OOPs_revise;

import java.util.*;

import arraylist.swap;

public class Duplicate {
    // public static void printDuplicate(String str) {
    // char[] chars = str.toCharArray();
    // Arrays.sort(chars);
    // int count = 1;
    // for (int i = 0; i < chars.length - 1; i++) {
    // if (chars[i] == chars[i + 1]) {
    // count++;
    // } else {
    // if (count > 1) {
    // System.out.println(chars[i] + " -> " + count);
    // }
    // count = 1;
    // }
    // }

    // // Print the last duplicate if present
    // if (count > 1) {
    // System.out.println(chars[chars.length - 1] + " -> " + count + " times");
    // }
    // }

    public static void printDuplicate(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int count = 1;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println(chars[i] + " -> " + count + " times");
                }
                count = 1;
            }
        }

        // for the final element
        if (count > 1) {
            System.out.println(chars[chars.length - 1] + " -> " + count + " times");
        }
    }

    public static void printDuplicates(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars[i + 1]) {
                System.out.println("duplicate character " + chars[i]);
            }
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                i++;
            }
        }
    }

    public static void bubblesort(int[] newArr) {
        int swap = 0;
        for (int turn = 0; turn < newArr.length - 1; turn++) {
            swap = 0;
            for (int j = 0; j < newArr.length - 1 - turn; j++) {
                if (newArr[j] > newArr[j + 1]) {
                    int temp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = temp;
                }
                swap++;
            }
            if (swap == 0) {
                System.out.println("already sorted");
            }
        }

    }

    public static void printArrElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "aabbccddee";
        printDuplicate(str);
        int[] numArr = new int[5];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        bubblesort(numArr);
        printArrElement(numArr);

    }
}