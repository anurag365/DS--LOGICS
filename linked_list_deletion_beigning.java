import java.util.Scanner;

public class linked_list_deletion_beigning {

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public node head = null;
        public node tail = null;

        public void Addnode(int data) {
            node newNode = new node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void deleteFromStart() {
            if (head == null) {
                System.out.println("LIST IS EMPTY");
                return;
            }

            if(head != tail) {  
                head = head.next;  
            }  
            //If the list contains only one node  
            //then, it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
     
    

        public void display() {
            node current = head;
            if (head == null) {
                System.out.println("list is empty");
                return;
            }

            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println(" ");

        }

        public static void main(String[] args) {
            linked_list_deletion_beigning ls = new linked_list_deletion_beigning();

            ls.Addnode(1);
            ls.Addnode(66);
            ls.Addnode(544);
            ls.Addnode(535);

            System.out.println("ORIGINAL LIST");
            ls.display();

            
                ls.deleteFromStart();
                System.out.println("UPDATED LIST");
                ls.display();
                
            
            

        }
    }


