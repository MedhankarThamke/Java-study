// here we are searching the key from the array 
//which is sorted and rotated {4,5,6,7,0,1,2}
// modified binary search

package divideandcon;

public class Rotated {

    public static int search(int arr[], int key, int si, int ei) {

        if (si > ei) {
            return -1;
        }
        // find mid
        int mid = si + (ei - si) / 2;

        // case found
        if (arr[mid] == key) {
            return mid;
        }

        // L1
        if (arr[si] <= arr[mid]) {
            // case a:left
            if (arr[si] <= key && key <= arr[mid]) {
                return search(arr, key, si, mid - 1);
            } else {
                // case b:right
                return search(arr, key, mid + 1, ei);
            }
        }
        // L2
        else {
            // case c:right
            if (arr[mid] <= key && key <= arr[ei]) {
                return search(arr, key, mid + 1, ei);
            } else {
                // case d:left
                return search(arr, key, si, mid - 1);

            }
        }
    }

    public static int searchtwo(int arr[], int key) {
        int si = 0;
        int ei = arr.length - 1;
        while (si < ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] == key) {
                return mid;
            } // L1
            else if (arr[si] <= arr[mid]) {
                // case a:left
                if (arr[si] <= key && key <= arr[mid]) {
                    ei = ei - 1;
                    // return search(arr, key, si, mid - 1);
                } else {
                    // case b:right
                    si = si + 1;
                    // return search(arr, key, mid + 1, ei);
                }
            } else {
                // case c:right
                if (arr[mid] <= key && key <= arr[ei]) {
                    si = si + 1;

                    // return search(arr, key, mid + 1, ei);
                } else {
                    // case d:left
                    ei = ei - 1;

                    // return search(arr, key, si, mid - 1);

                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 3;
        // O(nlogn)
        System.out.println(searchtwo(arr, target));

        // System.out.println(search(arr, target, 0, arr.length - 1));
    }
}