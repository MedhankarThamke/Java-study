package Stack.third;

import java.util.*;

public class Parantheses {

    public static boolean isValidPara(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if (s.peek() == '(' && ch == ')'
                        || s.peek() == '{' && ch == '}'
                        || s.peek() == '[' && ch == ']') {
                    s.pop();// got pair
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String args[]) {
        String str = "(){}[]}";
        System.out.println(isValidPara(str));
    }
}