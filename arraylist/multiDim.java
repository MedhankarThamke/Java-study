package arraylist;

import java.util.ArrayList;

public class multiDim {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        newList.add(list1);
        newList.add(list2);
        newList.add(list3);
        System.out.println(newList);

        for (int i = 0; i < newList.size(); i++) {
            ArrayList<Integer> currList = newList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
