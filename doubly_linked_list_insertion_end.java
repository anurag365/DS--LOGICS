import java.util.Scanner;

public class doubly_linked_list_insertion_end {
    public class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }

    public Node head = null;
    public Node tail = null;

    public void AddEnd(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newnode;
            newnode.previous = tail;
            tail = newnode;
            tail.next = null;

        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else{
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
        
    }

    public static void main(String[] args) {
        doubly_linked_list_insertion_end end = new doubly_linked_list_insertion_end();
        end.AddEnd(25);
        end.AddEnd(5);
        end.AddEnd(64);
        end.AddEnd(45);
        System.out.println("ORIGINAL ELEMENT");
        end.AddEnd(94);
        System.out.println("UPDATED ELEMENT");
        end.display();

    }
}
