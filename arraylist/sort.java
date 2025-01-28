package arraylist;

import java.util.ArrayList;

import java.util.Collections;

public class sort {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(6);
        list.add(7);
        list.add(5);
        list.add(9);
        list.add(7);
        // sorting using inbuilt method
        System.out.println(list);
        Collections.sort(list);
        // Collection is interface, Where as Collections is class
        System.out.println(list);

        // for decending we can use Collection.reverseOrder() which is comparator
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
