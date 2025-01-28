package Stack.one;

import java.util.ArrayList;

public class StackB {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            if (list.size() == 0) {
                return true;
            } else {
                return false;
            }
            // or return list.size==0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String args[]) {
        // Stack s = new Stack();
        // s.push(4);
        // s.push(3);
        // s.push(2);
        // s.push(1);

        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }

    }

}
