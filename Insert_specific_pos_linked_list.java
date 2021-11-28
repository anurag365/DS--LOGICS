import java.util.Scanner;

public class Insert_specific_pos_linked_list {

    class node{
        int data;
        node next;

        public  node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public node head=null;
    int size=0;
    public node tail=null;

    public void insertAtPos( int data,int pos){
     node n1=new node(data);

    if(pos<1){
    System.out.println("Invalid input");
}
else{

    node t1=head;
    for(int i=1;i<pos-1;i++){
        t1=t1.next;
    }
    node t2=t1.next;
    t1.next=n1;
    n1.next=t2;

}
    }
public void insertAtstart(int data){

    node newNode = new node(data);

    if(head==null){
        tail=newNode;
        head=newNode;
        size++;
    }
    else{
        node temp =head;
        head = newNode;
        head.next=temp;
        size++;
    }


}

public void insertAtEnd(int data){
    node newNode=new node(data);


    if(head==null){
       head=newNode;
       tail=newNode;
       size++;
    }
    else{
        tail.next=newNode;
        tail=newNode;
        size++;
    }

   


    

}
public void display(){

    node current =head;
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

        Insert_specific_pos_linked_list end=new Insert_specific_pos_linked_list();

        // end.insertAtPos(45,1);
       end.insertAtstart(1);
       end.insertAtEnd(5);
       end.insertAtPos(25, 2);
       
        end.display();


    }
}
