package arrays;

public class sumSubArray3 {
    public static void sumSubArray(int nums[]) {
        // kadane's algorithm
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            currSum += nums[i];
            if (currSum > max) {
                max = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }

        }
        System.out.println(max);
    }

    public static void main(String args[]) {
        int nums[] = { -8, -2, -6, -3 };
        sumSubArray(nums);
        // when all the nums are negative we will get the values which is the greatest
        // among them
    }
}
