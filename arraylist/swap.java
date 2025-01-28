package arraylist;

import java.util.ArrayList;

public class swap {
    public static void swapping(ArrayList<Integer> newList, int idx1, int idx2) {
        int temporary = newList.get(idx1);
        newList.set(idx1, newList.get(idx2));
        newList.set(idx2, temporary);

    }

    public static void main(String args[]) {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
        // System.out.println(newList);
        swapping(newList, 1, 4);
        // System.out.println(newList);

    }

}
