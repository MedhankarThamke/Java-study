package Stack.two;

import java.util.*;

public class Nextgreater {
    public static void main(String args[]) {
        int arr[] = { 6, 8, 10, 5, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // step1
            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // step2
            if (s.empty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            // step3
            s.push(i);
        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }

    }
}
// package Stack.two;

// import java.util.*;

// public class Nextgreater {
// public static void main(String args[]) {
// int arr[] = { 6, 8, 10, 5, 3 };
// Stack<Integer> s = new Stack<>();
// int nextGreater[] = new int[arr.length];

// for (int i = arr.length - 1; i >= 0; i--) {
// // Step 1: Remove elements from stack smaller than or equal to arr[i]
// while (!s.empty() && s.peek() <= arr[i]) {
// s.pop();
// }

// // Step 2: Find the next greater element
// if (s.empty()) {
// nextGreater[i] = -1; // No greater element
// } else {
// nextGreater[i] = s.peek(); // Stack's top is the next greater
// }

// // Step 3: Push the current element onto the stack
// s.push(arr[i]);
// }

// // Print the next greater elements
// for (int i = 0; i < nextGreater.length; i++) {
// System.out.print(nextGreater[i] + " ");
// }
// }
// }
