package arrays;

public class sumSubArray1 {
    // brute force
    public static void sumSubArray(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = 0;

                for (int k = i; k <= j; k++) {
                    currSum = currSum + nums[k];

                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                System.out.println("sum of sub-arrays: " + currSum);
            }

        }
        System.out.println("Max sum of sub-arrays: " + maxSum);
    }

    public static void main(String args[]) {
        int nums[] = { 1, -2, 6, 3 };
        sumSubArray(nums);
    }
}
