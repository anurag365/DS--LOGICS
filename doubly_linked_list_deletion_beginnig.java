import java.util.Scanner;

public class doubly_linked_list_deletion_beginnig {
 public class node{
int data;
node next=null;
node prev =null;
 
     node(int data){
         this.data=data;

     }
 }

 public node head=null;
 public node tail=null;

 public void Addnode(int data){
     node newnode =new node(data);
     if(head==null){
         head=tail=newnode;
         head.prev=null;
         tail.next=null;
     }else{
         tail.next=newnode;
         newnode.prev=tail;
         tail=newnode;
         tail.next=null;
     }
 }

 public void Delbeg(){
   
     if(head==null){
         
         return;
     }else
     if(head!=tail){
         head=head.next;
         head.prev=null;

     }else{
         head=tail=null;
     }
 }


 public void display(){
node current=head;
if(current==null){
    System.out.println("LIST IS EMPTY");
    return;
}else{
    while(current!=null){
        System.out.println(current.data + " ");
        current=current.next;
    }
}

 }
    public static void main(String[] args)
    {
        doubly_linked_list_deletion_beginnig beg =new doubly_linked_list_deletion_beginnig();
        System.out.println("ORIGINAL ELEMENT");
        beg.Addnode(3);
        beg.Addnode(4);
        beg.Addnode(5);
        beg.Addnode(6);
        beg.Addnode(7);
        beg.display();
       

        System.out.println("AFTER DELTION");
        beg.Delbeg();
        beg.display();

       

    }

}
