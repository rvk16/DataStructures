package week2.linked_list;
import algorithms.linked_list.Node;

import static algorithms.linked_list.Node.printLinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(4);
        Node n5 = new Node(4);

        head.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;

        printLinkedList(head);

        Node newHead = reverseLLRecursively(head);

        printLinkedList(newHead);
    }

    private static Node reverseLLRecursively(Node head) {
        if (head == null || head.next == null) return head;

        Node headOfSubProblem = reverseLLRecursively(head.next);

        head.next.next = head;
        head.next = null;
        return headOfSubProblem;
    }

    private static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) return head;

        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

}
