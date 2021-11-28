import java.util.Scanner;

public class doubly_linked_list_deletion_end {
   public class node {
      int data;
      node prev;
      node next;

      node(int data) {
         this.data = data;
      }
   }

   public node head = null;
   public node tail = null;

   public void addNode(int data) {
      node Newnode = new node(data);
      if (head == null) {
         head = tail = Newnode;
         head.prev = null;
         tail.next = null;

      } else {
         tail.next = Newnode;
         Newnode.prev = tail;
         tail = Newnode;
         tail.next = null;

      }

   }

   public void DelEnd() {

      if (head == null) {
         return;
      } else {
         tail = tail.prev;
         tail.next = null;

      }
   }

   public void display() {
      node current = head;
      if (current == null) {
         System.out.println("LIST IS EMPTY");

      } else {
         while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
         }
      }
   }

   public static void main(String[] args) {
      doubly_linked_list_deletion_end end =new doubly_linked_list_deletion_end();
      System.out.println("ORIGINAL ELEMENT");
      end.addNode(14);
      end.addNode(4);
      end.addNode(54);
      end.addNode(5554);
      end.addNode(146);
      end.display();

      end.DelEnd();
      System.out.println("AFTER DELETION FROM END");
      end.display();

   }
}
