import java.util.Scanner;

   
   public class circular_linked_list_deletion_beginning {

    class Node{
        int data;
        Node next;

    public Node(int data){
        this.data=data;
        Node next=null;
    }    
    }

    public Node head=null;
    public Node tail=null;

    public void Addnode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
            tail=newNode;
           

        }else{

           
           newNode.next=head;
           head=newNode;
           tail.next=head;
           
           
        }

    }

    public void  Deletebeginning(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }else{
            if(head!=tail){
                head=head.next;
                tail.next=head;
            }else{

                head=tail=null;
            }
            
        }

    }

    public void display(){

        Node current = head;
        if(head==null){
            System.out.println("LIST IS EMPTY");
        }
        else{
            do{
                System.out.println(current.data+" ");
                current=current.next;
            }while(current!=head);
            // System.out.println();
        }
    }


    
       public static void main(String[] args)
    {
        circular_linked_list_deletion_beginning delbeg =new circular_linked_list_deletion_beginning();

        delbeg.Addnode(2);
        delbeg.Addnode(4);
        delbeg.Addnode(6);
        delbeg.Addnode(8);
        delbeg.Addnode(10);

        System.out.println("ORIGINAL LIST");
        delbeg.display();

        delbeg.Deletebeginning();
        System.out.println("UPDATED LIST");
        delbeg.display();
    }
}
