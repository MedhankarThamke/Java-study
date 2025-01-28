package arraylist.pair_sum;

import java.util.ArrayList;

public class first {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        // brute force
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println("value at index " + i + " and " + j + " give us the sum " + target);
                    return true;
                }
            }
        }
        System.out.println("no two value in given list gives us the value " + target);
        return false;
    }

    public static void main(String args[]) {
        System.out.println("dsa");
        int target = 65;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        pairSum1(list, target);
    }

}