package week2.linked_list;

import algorithms.linked_list.Node;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(4);
        Node n5 = new Node(4);

        head.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;

        printLinkedList(head);

        Node newHead = removeDuplicateElements(head);

        printLinkedList(newHead);
    }

    private static Node removeDuplicateElements(Node head) {
        Node newHead = null;
        Node original = head;
        Node temp = head;

        while (original != null) {
            while (original.next != null && original.data == original.next.data) {
                original = original.next;
            }

            if(newHead == null) {
                newHead = temp = original;
            } else {
                temp.next = original;
                temp = original;
            }
            original = original.next;
        }
        return newHead;
    }

    private static void printLinkedList(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
