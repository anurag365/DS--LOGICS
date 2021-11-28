import java.util.Scanner;

public class circular_linked_loist_display {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public Node head = null;
    public Node tail = null;

    public void Addnode(int data) {
        Node Newnode = new Node(data);
        if (head == null) {
            head = Newnode;
            tail = Newnode;
             Newnode.next=head;

        } else {
            tail.next = Newnode;
            tail = Newnode;
            tail.next = head;

        }
    }

    void display() {
        Node current = head;
        if (head == null) {
            System.out.println("LIST IS EMPTY");
            return;
        }  
            do{
                System.out.println(current.data + " ");
                current = current.next;


            }while(current!=head);
            System.out.println();

                
            

        }

    

    public static void main(String[] args) {
        circular_linked_loist_display display = new circular_linked_loist_display();
        display.Addnode(1);
        display.Addnode(2);
        display.Addnode(3);
        display.Addnode(4);
        display.Addnode(5);

        System.out.println("NODES ARE");
        display.display();
    }
}
