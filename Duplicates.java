import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void removeDuplicates() {
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            int currentValue = current.data;
            if (set.contains(currentValue)) {
                prev.next = current.next;
            } else {
                set.add(currentValue);
                prev = current;
            }
            current = current.next;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class Duplicates {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(3);
        list.head.next.next.next.next = new Node(3);
        list.head.next.next.next.next.next = new Node(4);

        System.out.print("Original List: ");
        list.printList();

        list.removeDuplicates();

        System.out.print("\nModified List: ");
        list.printList();
    }
}