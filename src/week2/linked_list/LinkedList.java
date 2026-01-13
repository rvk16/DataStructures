package week2.linked_list;

public class LinkedList {
    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node<Integer> head = new Node<>(5);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(7);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        printLinkedList(head);
        head = insertLinkedList(0,9,head);
        printLinkedList(head);
        head = deleteFromLinkedList(3 ,head);
        printLinkedList(head);
    }

    private static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node<Integer> insertLinkedList(int pos, int data, Node<Integer> head) {
        Node<Integer> newNode = new Node<>(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        if (head == null) {
            throw new IllegalArgumentException("Cannot insert at position " + pos + " in empty list");
        }

        Node<Integer> temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp.next == null) {
                throw new IllegalArgumentException("Position " + pos + " is out of bounds");
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    private static Node<Integer> deleteFromLinkedList(int pos, Node<Integer> head) {
        Node<Integer> temp = head;
        if (pos == 0) {
            return head.next;
        }

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}

