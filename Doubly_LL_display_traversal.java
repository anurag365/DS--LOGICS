import java.util.Scanner;

public class Doubly_LL_display_traversal {
    
    class Node{
        int data;
        Node next;
        Node previous;

        public Node(int data){
            this.data=data;
        }


    }

    public Node head=null;
    public Node tail=null;

    public void Addnode(int data){
        Node Newnode=new Node(data);

        if(head==null){
            head=Newnode;
            tail=Newnode;
            head.previous=null;
            tail.next=null;

        }
        else{
            tail.next=Newnode;
            Newnode.previous=tail;
            tail=Newnode;
            tail.next=null;
        }
    }

    public void display(){
        Node current =head;
        if(current==null){
            System.out.println("LIST IS EMPTY");
            return;

           
        }else{
            while(current!=null){
            System.out.println(current.data + " ");
            current = current.next;
            }
        }
    }
    public static void main(String[] args)
    {
        Doubly_LL_display_traversal ddll =new Doubly_LL_display_traversal();
        ddll.Addnode(2);
        ddll.Addnode(5);
        ddll.Addnode(8);
        ddll.Addnode(11);
        ddll.Addnode(14);

    System.out.println("LL IS");
    ddll.display();
    }
}
