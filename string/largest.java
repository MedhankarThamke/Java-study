// here we are comparing the string but
// but lexicographically

package string;

public class largest {
    public static void main(String args[]) {
        String fruits[] = { "apple", "banana", "mango" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }

}