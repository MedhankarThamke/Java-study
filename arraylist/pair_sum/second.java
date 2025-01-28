// using 2pointer O(n)
package arraylist.pair_sum;

import java.util.ArrayList;

public class second {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int LP = 0;
        int RP = list.size() - 1;
        while (LP != RP) {
            if (list.get(LP) + list.get(RP) == target) {
                System.out.println("We get the target at index " + LP + " and " + RP);
                return true;
            } else if (list.get(LP) + list.get(RP) < target) {
                LP++;
            } else {
                RP--;
            }
        }
        System.out.println("we cannot get the sum " + target + " from the list ");
        return false;

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        pairSum2(list, 45);
    }
}
