package arrays;

class subArray {
    public static void subArrays(int nums[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int tp = 0;
        // int start = 0, end = nums.length;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("index element: " + nums[i]);
            for (int j = i; j < nums.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                    sum = sum + nums[k];
                    if (sum > max) {
                        max = sum;
                    }
                    if (sum < min) {
                        min = sum;
                    }

                }
                System.out.println();
                System.out.println("sum of sub-arrays: " + sum);
                tp++;
                System.out.println();
            }

        }
        System.out.println("total pairs:" + tp);
        System.out.println("Min sum of sub-array found is: " + min);
        System.out.println("max sum of sub-array found is: " + max);
    }

    public static void main(String args[]) {
        int nums[] = { 2, 12, 3, 4 };
        subArrays(nums);
    }

}