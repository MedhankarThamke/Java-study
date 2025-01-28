package practise_arrays;

// to check if the num in the arr have appeared twice
// return true if yes
// and false if no 
public class twice {
    public static boolean checkTwice(int nums[]) {
        int currNum = nums[0];
        boolean status = false;
        for (int i = 0; i < nums.length - 1; i++) {
            currNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (currNum == nums[j]) {
                    return true;
                }
            }
        }
        return status;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 1 };

        System.out.println(checkTwice(nums));
    }
}
