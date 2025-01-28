package arraylist;

import java.util.ArrayList;

public class newOne {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(31);
        list.add(10);
        list.add(2003);// O(n)
        // System.out.println(list);

        // get element
        // int element = list.get(2);
        // System.out.println(element);

        // remove
        list.remove(1);
        // System.out.println(list);

        // Set element at index
        list.set(1, 2025);
        // System.out.println(list);

        // contains check element in list
        // System.out.println(list.contains(2025));
        // System.out.println(list.contains(1));

        // get size of list
        // System.out.println(list.size());

        // print reverse
        for (int i = list.size() - 1; i >= 0; i--) {
            // System.out.print(list.get(i) + " ");
        }

        // find maximum
        int maximum = Integer.MIN_VALUE;
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (maximum < list.get(i)) {
                maximum = list.get(i);
            }
            // maximum = Math.max(maximum, list.get(i));
        }

        System.out.println(maximum);
    }
}
