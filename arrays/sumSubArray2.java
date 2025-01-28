package arrays;

public class sumSubArray2 {
    // prefix sum
    public static void sumSubArray(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        // prefix 0th index element is nums 0th index element
        prefix[0] = nums[0];

        // to add the prefix element
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                // we also need to check for the start =0
                // so we are gonna use ternary operator
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                // System.out.println("sum of sub-arrays: " + currSum);
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String args[]) {
        int nums[] = { -1, -2, -6, -3 };
        sumSubArray(nums);
    }
}
