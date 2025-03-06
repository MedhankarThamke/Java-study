package hashing;

import java.util.*;

public class Implement {
    public static char getMaximumOccuringChar(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int n = str.length();
        char ans = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);

            if (cnt < hm.get(c)) {
                ans = c;
                cnt = hm.get(c);
            }
        }
        return ans;
    }

    public char getMax(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int n = str.length();
        char ans = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);

            hm.put(c, hm.getOrDefault(c, 0) + 1);

            if (cnt < hm.get(c)) {
                ans = c;
                cnt = hm.get(c);
            }
        }
        return ans;

    }

    public static void duplicate(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int count = 1;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println(chars[i] + " -> " + count);
                }
                count = 1;
            }
        }
        if (count > 1) {
            System.out.println(chars[chars.length - 1] + " -> " + count);
        }
    }

    public static void main(String args[]) {
        System.out.println(getMaximumOccuringChar("aaaabb"));
    }
}