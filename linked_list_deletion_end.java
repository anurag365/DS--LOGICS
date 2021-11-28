import java.util.Scanner;
   
   public class linked_list_deletion_end {
   class node{
       int data;
       node next;

       public node(int data){
           this.data=data;
           this.next=null;
       }
    }

    public node head=null;
    public node tail=null;

    public void AddNode(int data){

        node newNode =new node(data);

        if(head==null){
           head=newNode;
           tail=newNode;


        }
        else{
           tail.next=newNode;
           tail=newNode;
            
        }

    }

    public void deleteFromEnd(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
        }
        else{
            node temp = head;
            while(temp.next!= tail){
                temp = temp.next;
            }
            temp.next=null;
            tail=temp;
        }


    }

    

    public void display(){

        node current =head;
        if(head==null){
            System.out.println("LIST IS EMPTY");
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
        linked_list_deletion_end end= new linked_list_deletion_end();
        end.AddNode(2);
        end.AddNode(8);
        end.AddNode(16);
        end.AddNode(32);
        end.AddNode(64);
        end.AddNode(128);

        System.out.println("ORIGINAL LIST");
        end.display();

        end.deleteFromEnd();

        System.out.println("UPDATED LIST");
        end.display();

    }
}
