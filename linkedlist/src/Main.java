package src;

public class Main {

    public static void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " -> ");
            curr = curr.getNext();
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);

        Node head = a;
        printLinkedList(head);
    }
}
