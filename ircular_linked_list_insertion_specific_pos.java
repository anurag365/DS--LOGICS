import java.util.Scanner;
public class ircular_linked_list_insertion_specific_pos {
    
    class node{
        int data;
        node next;

        public node(int data){

            this.data=data;
            this.next=null;
        }


    }

    public node head =null;
    public node tail =null;

    public void InsertSpecificPos( int data){
        node Newnode = new node(data);
        if(head==null){
            head=Newnode;
            tail=Newnode;


        }
        else{
            node temp=head;

        }

    }
    public static void main(String[] args)
    {
    
    }
}
