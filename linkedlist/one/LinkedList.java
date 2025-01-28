package linkedlist.one;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
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

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.add(2, 31);
        ll.print();
        // System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        // System.out.println(ll.size);

        System.out.println(ll.search(31));
        System.out.println(ll.search(320));

    }
}