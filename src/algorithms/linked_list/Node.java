package algorithms.linked_list;

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public static void printLinkedList(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
