import java.util.Scanner;
public class creating_traversing_linked_list {

    class Node{
        int data ;
        Node next;
    

    public Node(int data){

        this.data=data;
        this.next=null;
    }
}

public Node head =null;
public Node tail=null;

public void addNode(int data){
    Node newNode=new Node(data);


if(head==null){
    head = newNode;
    tail = newNode;
}
else{
    tail.next=newNode;
    tail=newNode;
}
}

public void display(){

    Node first = head;

    if(head==null){
        System.out.println("Error");
        return;

    }

    System.out.println("Node of singly linked list are as follows");

    while(first !=null){
        System.out.println(first.data + "");
        first = first.next;
    }

}
    
    public static void main(String[] args)
    {
    
        creating_traversing_linked_list list = new creating_traversing_linked_list();

        list.addNode(2);
        list.addNode(10);
        list.addNode(25);
        list.addNode(28);
        list.addNode(21);

        list.display();



    
}
}
