import java.util.Scanner;

public class Doubly_LL_insertion_beginning {
    class Node{
        int data;
        Node next;
        Node previous;
    
        Node(int data){

            this.data=data;
        }
    }

    public Node head=null;
    public Node tail=null;

    public void AddnodeAt(int data){
        Node Newnode=  new Node(data);
        if(head==null){
            head=Newnode;
            tail=Newnode;
            head.previous=null;
            tail.next=null;
        }
        else{
            head.previous=Newnode;
            Newnode.next=head;
            Newnode.previous=null;
            head=Newnode;


        }

    }

    public void display(){
        Node current =head;
        if(current==null){
            System.out.println("Error");
            return;
        }
        else{
            while(current!=null){

                System.out.println(current.data + " ");
                current=current.next;
            }
        }
    }



public static void main(String[] args)
{

    Doubly_LL_insertion_beginning DIB = new Doubly_LL_insertion_beginning();
    DIB.AddnodeAt(2);
    DIB.AddnodeAt(4);
    DIB.AddnodeAt(6);
    DIB.AddnodeAt(8);
    DIB.AddnodeAt(10);

    System.out.println("ORIGINAL LIST");
    DIB.AddnodeAt(211);
    System.out.println("UPDATED LIST");
    DIB.display();

    




}

    
}
