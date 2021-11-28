import java.util.Scanner;

public class circular_linked_list_insertion_end {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void InsertEnd(int data) {
        Node Newnode = new Node(data);
        if (head == null) {
            head = Newnode;
            
            tail = Newnode;
            Newnode.next=head;

        } else {
            
            tail.next=Newnode;
            tail=Newnode;
            tail.next=head;



        }

    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("LIST IS EMPTY");
            return;
            
        } else {
            do{
                System.out.println(current.data + " ");
                current = current.next;
            }
            while (current != head);
               return;
                

            

        }

    }

    public static void main(String[] args) {
        circular_linked_list_insertion_end CLL = new circular_linked_list_insertion_end();
        CLL.InsertEnd(2);
        CLL.InsertEnd(3);
        CLL.InsertEnd(4);
        CLL.InsertEnd(25);
        CLL.InsertEnd(265);
        CLL.InsertEnd(2444);

        System.out.println("ORIGINAL LIST");
        CLL.display();

        CLL.InsertEnd(99);
        System.out.println("UPDATED CLL");
        CLL.display();
    }
}
