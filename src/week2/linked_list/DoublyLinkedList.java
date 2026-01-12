package week2.linked_list;

public class DoublyLinkedList {
    public static void main(String[] args) {

    }
}

class DoublyNode<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    DoublyNode(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
