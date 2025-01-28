package arraylist;

import java.util.ArrayList;

public class multi {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> multiDimensionList = new ArrayList<>();

        // list1
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        multiDimensionList.add(list1);

        // list2
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(9);
        multiDimensionList.add(list2);

        // traversing
        for (int i = 0; i < multiDimensionList.size(); i++) {
            ArrayList<Integer> currList = multiDimensionList.get(i);
            // we will get the whole list in above
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        // or
        System.out.println(multiDimensionList);
    }
}
