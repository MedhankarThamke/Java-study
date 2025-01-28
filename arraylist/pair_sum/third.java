// find if any pair in sorted and rotated array list has a target sum
// [11,15,6,8,9,10] target=16
// can be done by brute force, here we are using the 
package arraylist.pair_sum;

import java.util.ArrayList;

public class third {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int BP = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= list.get(i + 1)) {
                // breaking point
                BP = i;
                break;
            }
        }
        int RP = BP;
        int LP = BP + 1;
        int n = list.size();
        while (LP != RP) {
            if (list.get(LP) + list.get(RP) == target) {

                System.out.println("Target sum is found at index " + RP + " and " + LP);
                return true;
            } else if (list.get(LP) + list.get(RP) < target) {
                LP = (LP + 1) % n;
            } else {
                RP = (n + RP - 1) % n;
            }
        }
        System.out.println("Cannot find the target sum " + target + " in the list");
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 19;
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum(list, target));
    }
}
