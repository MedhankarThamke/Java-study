package linkedlist2.two;

// here we are using collection to use the inbuilt Linkedlist
// import java.util.LinkedList;

public class LinkedList2 {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data) {
        // step1 create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 linking new node
        newNode.next = head;

        // step 3 update the head part
        head = newNode;
    }

    // add last
    public void addLast(int data) {
        // ṣtep1 create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step2 linking new node to tail
        tail.next = newNode;

        // step 3 point the tail to new created node
        tail = newNode;
    }

    // print the data of linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add in middle
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i=idx-1 temp=prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove first
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    // remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            int val = Integer.MIN_VALUE;
            return val;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        // index=size-2
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;// tail data
        prev.next = null;
        size--;
        tail = prev;
        return val;
    }

    public int search(int key) {
        Node curr = head;
        int index = 0;
        while (curr != null) {
            if (curr.data == key) {
                return index;
            }
            curr = curr.next;
            index++;
        }
        return -1;
    }

    // recursive search
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // mergesort
    public Node Mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = midOfLL(head);

        // left and right LL
        Node leftHead = head;
        Node rightHead = mid.next;

        mid.next = null;
        Node newLeft = Mergesort(leftHead);
        Node newRight = Mergesort(rightHead);
        return merge(newLeft, newRight);
    }

    public Node midOfLL(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node newLeft, Node newRight) {
        Node mergerLL = new Node(-1);
        Node temp = mergerLL;

        while (newLeft != null && newRight != null) {
            if (newLeft.data <= newRight.data) {
                temp.next = newLeft;
                newLeft = newLeft.next;
                temp = temp.next;
            } else {
                temp.next = newRight;
                newRight = newRight.next;
                temp = temp.next;
            }

        }
        while (newLeft != null) {
            temp.next = newLeft;
            newLeft = newLeft.next;
            temp = temp.next;
        }
        while (newRight != null) {
            temp.next = newRight;
            newRight = newRight.next;
            temp = temp.next;
        }
        return mergerLL.next;
    }

    // palindrome
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 find mid
        Node midNode = midOfLL(head);
        // step2 reverse from middle
        Node curr = midNode;
        Node next;
        Node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        // right half head and left half head
        Node right = prev;
        Node left = head;
        // step3 check left and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    // reverse
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void zigZagLL(Node head) {
        // find mid node
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // alternate merging
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            // updation
            right = nextR;
            left = nextL;
        }
    }

    public static void main(String args[]) {
        // initialize
        // LinkedList<Integer> ll = new LinkedList<>();

        // // add
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(6);
        // System.out.println(ll); // print

        // // remove
        // ll.remove(1);

        LinkedList2 ll = new LinkedList2();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);

        ll.print();
        ll.zigZagLL(head);
        // ll.head = ll.Mergesort(ll.head);// O(nlogn)
        ll.print();
    }
}
