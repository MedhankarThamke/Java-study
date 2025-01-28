package arrays;

public class binarySearch {
    public static int binarySearching(int nums[], int key) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            // System.out.println(mid);
            if (nums[mid] == key) {
                return mid;
            } else if (key < nums[mid]) {
                // left
                end = mid - 1;
            } else if (nums[mid] < key) {
                // right
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 4, 6, 7, 8, 9, 10, 11, 14 };
        int key = 9;
        int mid = 9 / 2;
        System.out.println(mid);
        System.out.println("your num is at index " + binarySearching(nums, key));

    }
}
