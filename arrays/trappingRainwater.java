package arrays;

// import java.util.*;

public class trappingRainwater {
    public static int trappedWater(int height[]) {
        int n = height.length;

        // calculate left and right max boundary
        // using auxillary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // show the leftmax array
        for (int i = 0; i < leftMax.length; i++) {
            System.out.print(leftMax[i] + " ");
        }
        System.out.println("this is the leftmax array ");
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // show the rightmax array
        for (int i = 0; i < rightMax.length; i++) {
            System.out.print(rightMax[i] + " ");
        }
        System.out.println("this is the right max array ");

        int water = 0;
        // loop
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            water += waterlevel - height[i];
        }
        return water;
        // trappedwater=waterlevel-height[i]
        // waterlevel=min(leftmaxbound,rightmaxbound)

    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int totalWater = trappedWater(height);
        System.out.println("total water that can be trapped is: " + totalWater);
    }
}
