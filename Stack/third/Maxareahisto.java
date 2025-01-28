package Stack.third;

import java.util.*;

public class Maxareahisto {
    public static int maximumArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = -1;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();// empty the stack

        for (int i = 0; i <= arr.length - 1; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);

        }
        // calculate area: width=j-i-1, nsr[j]-nsl[i]-1;
        for (int i = -0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);

        }
        return maxArea;
    }

    public static void main(String args[]) {
        // int arr[] = new int[6];
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println("Maximum area of the histogram = " + maximumArea(arr));
    }
}