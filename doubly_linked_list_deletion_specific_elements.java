import java.util.Scanner;

public class doubly_linked_list_deletion_specific_elements {
    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;

        }
    }

    public Node head = null;
    public Node tail = null;
    Node temp = head;

    public void addNode(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            head.prev = null;
            tail.next = null;

        } else {

            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
            tail.next = null;
        }
    }

    public void deleteAtSpec(int node) {
        if (head == null) {
            System.out.println("LIST IS EMPTY");
            return;
        } else {
            for (int i = 1; i < node - 1; i++) {
                temp = temp.next;
            }

            temp.next = tail;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("ERROR OCCURED");
            return;
        } else {
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }

    }

    public static void main(String[] args) {
        doubly_linked_list_deletion_specific_elements spec = new doubly_linked_list_deletion_specific_elements();
        System.out.println("ORIGINAL ELEMENT");
        spec.addNode(20);
        spec.addNode(18);
        spec.addNode(22);
        spec.addNode(16);
        spec.addNode(24);
        spec.addNode(14);
        spec.display();

        spec.deleteAtSpec(3);
        System.out.println("AFTER DELETION");

        spec.display();
    }
}
