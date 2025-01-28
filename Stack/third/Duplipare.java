package Stack.third;

// her we are checking is given expression has unnecessary parenthesis 
import java.util.*;

public class Duplipare {
    public static boolean isDuplicatePare(String str) {

        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing tag
            if (ch == ')') {
                int count = 0;
                while (!s.empty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                }

            }
            // opening
            else {
                s.push(ch);
            }
        }
        return false;

    }

    public static void main(String args[]) {

        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDuplicatePare(str));
        System.out.println(isDuplicatePare(str2));
    }
}