// bruteforce O(n^2)
package arraylist.container;

import java.util.ArrayList;

public class water {
    public static int storeWater(ArrayList<Integer> heightOnAxis) {
        int max = 0;
        // brute force
        for (int i = 0; i < heightOnAxis.size(); i++) {
            for (int j = i + 1; j < heightOnAxis.size(); j++) {
                int height = Math.min(heightOnAxis.get(i), heightOnAxis.get(j));
                int width = j - i;
                int areaOfWater = height * width;
                max = Math.max(max, areaOfWater);
            }
        }
        return max;
    }

    public static void main(String args[]) {
        ArrayList<Integer> heightOnAxis = new ArrayList<>();
        // 1 8 6 2 5 4 8 3 7
        heightOnAxis.add(1);
        heightOnAxis.add(8);
        heightOnAxis.add(6);
        heightOnAxis.add(2);
        heightOnAxis.add(5);
        heightOnAxis.add(4);
        heightOnAxis.add(8);
        heightOnAxis.add(3);
        heightOnAxis.add(7);

        System.out.println("Max water we can store is " + storeWater(heightOnAxis));
    }
}