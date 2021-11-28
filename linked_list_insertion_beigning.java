import java.util.Scanner;

public class linked_list_insertion_beigning {

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

public void insertAtstart(int data){

    node newNode = new node(data);

    if(head==null){
        tail=newNode;
        head=newNode;
    }
    else{
        node temp =head;
        head = newNode;
        head.next=temp;
    }


}

public void display(){
    node first=head;
    if(first==null){
        System.out.println("LIST IS EMPTY");

    }
    else{
        System.out.println("NODES ARE AS FOLLOWS");
        while(first!=null){
           

            System.out.println(first.data + " ");
            first=first.next;
        }
    }


}



    public static void main(String[] args) {
        linked_list_insertion_beigning linked=new linked_list_insertion_beigning();
        linked.insertAtstart(20);
        linked.insertAtstart(2);
        linked.insertAtstart(220);
        linked.insertAtstart(320);
        linked.insertAtstart(2066);
        linked.insertAtstart(2550);

        linked.display();



    }
}
    