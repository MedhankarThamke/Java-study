package Stack.one;

// problem - push at bottom  of stack 
// problem - reversse a string using the stack
import java.util.*;

public class StackColl {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder newStr = new StringBuilder();
        // String reversed = "";
        while (!s.isEmpty()) {
            newStr.append(s.pop());
            // reversed += s.pop();
        }
        return newStr.toString();
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();// Stack can be implemented collections

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // pushAtBottom(s, 5);

        // while (!s.isEmpty()) {
        // System.out.println(s.pop());
        // }

        // String str = "medhankar";
        // System.out.println(reverseString(str));
        reverseStack(s);
        printStack(s);

    }
}
