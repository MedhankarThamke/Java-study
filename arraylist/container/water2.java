// 2 pointer approach O(n)
package arraylist.container;

import java.util.ArrayList;

public class water2 {
    public static int waterStored(ArrayList<Integer> axis) {
        int LP = 0;
        int RP = axis.size() - 1;
        int maxWater = 0;
        while (LP < RP) {
            int width = RP - LP;
            int height = Math.min(axis.get(LP), axis.get(RP));
            int currentWater = width * height;
            maxWater = Math.max(maxWater, currentWater);

            if (axis.get(LP) < axis.get(RP)) {
                LP++;
            } else {
                RP--;
            }
        }
        return maxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> axis = new ArrayList<>();
        // 1 8 6 2 5 4 8 3 7
        axis.add(1);
        axis.add(8);
        axis.add(6);
        axis.add(2);
        axis.add(5);
        axis.add(4);
        axis.add(8);
        axis.add(3);
        axis.add(7);

        System.out.println("Maximum water that can be stored is " + waterStored(axis));
    }
}
