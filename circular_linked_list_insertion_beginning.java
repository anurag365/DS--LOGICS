import java.util.Scanner;

public class circular_linked_list_insertion_beginning {
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

    public void Insertbeginning(int data) {
        Node Newnode = new Node(data);
        if (head == null) {
            head = Newnode;
            
            tail = Newnode;
            Newnode.next=head;

        } else {
            
           
            Newnode.next=head;
            head=Newnode;
            tail.next=Newnode;



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
        circular_linked_list_insertion_beginning CLL = new circular_linked_list_insertion_beginning();
        CLL.Insertbeginning(2);
        CLL.Insertbeginning(3);
        CLL.Insertbeginning(4);
        CLL.Insertbeginning(25);
        CLL.Insertbeginning(265);
        CLL.Insertbeginning(2444);

        System.out.println("ORIGINAL LIST");
        CLL.display();

        CLL.Insertbeginning(99);
        System.out.println("UPDATED CLL");
        CLL.display();
    }
}
