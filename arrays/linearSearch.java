package arrays;

// import java.util.*;

public class linearSearch {
    public static int linearSearching(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {

            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int marks[] = { 2, 3, 5, 6, 7, 8, 9, 10 };
        int key = 8;

        System.out.println("key is at " + linearSearching(marks, key));
    }
}
