package string;

import java.util.*;

public class basic {
    public static void main(String args[]) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str1 = new String("ABC");
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);
        // System.out.println(name.length());

        // concatenation
        System.out.println(str + " " + str1);
        System.out.println(str.charAt(2));
        sc.close();
    }
}
