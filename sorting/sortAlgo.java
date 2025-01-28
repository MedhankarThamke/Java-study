package sorting;

public class sortAlgo {
    public static void bubbleSorting(int nums[]) {
        for (int turn = 0; turn < nums.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < nums.length - 1 - turn; j++) {
                if (nums[j] < nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap += 1;

                }

            }
            if (swap == 0) {
                System.out.println("Already sorted!");
                break;
            }
        }
    }

    public static void selectionSort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minPos] < nums[j]) {
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void insertionSort(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] < curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            // insertion
            nums[prev + 1] = curr;
        }
    }

    public static void countSort(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max((largest), nums[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 7, 4, 5, 9 };
        // bubbleSorting(nums);
        countSort(nums);
        printArr(nums);
        // changed to descending
    }
}
