import java.util.Scanner;



public class linked_list_insert_end {

    class Node{
        int data;
        Node next;


    public  Node(int data){
         this.data=data;
         this.next=null;
 
    }  

    }

    public Node head=null;
    public Node tail=null;

    public void insertAtEnd(int data){
     Node newNode=new Node(data);


     if(head==null){
        head=newNode;
        tail=newNode;
     }
     else{
         tail.next=newNode;
         tail=newNode;
     }

    }

    public void display(){

        Node current =head;
        if(current==null){
            System.out.println("List is empty");
            return;
        }
        else{
            System.out.println("INSERTION ARE AS FOLLOWS");
            while(current!=null){
                System.out.print(current.data + " ");
                current=current.next;
            }
            System.out.println(" ");
        }

    }




    

   
    public static void main(String[] args)
    {
        linked_list_insert_end end=new linked_list_insert_end();
end.insertAtEnd(99);
end.display();
        end.insertAtEnd(24);
        end.display();
        end.insertAtEnd(4);
        end.display();
        end.insertAtEnd(54);
        end.display();
        end.insertAtEnd(64);
        


        end.display();

    }
}
