import java.util.Scanner;
public class cifcular_linked_list_deletion_end {

    public class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public node head = null;
    public node tail = null;

    public void Addnode(int data) {
        node Newnode = new node(data);
        if (head == null) {
            head = Newnode;
            tail = Newnode;
            Newnode.next = head;
        } else {
            
            tail.next = Newnode;
            tail=Newnode;
            tail.next=head;

        }

    }

    public void deleteEnd(){
        if(head==null){
            System.out.println("SORRY,AN ERROR OCCURED");
            return;
        }else{
            node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            tail.next=head;
        }

    }
    
    public void display(){
node temp=head;
if(head==null){
    System.out.println("TRY AGAIN BY INSERTING THE ELEMENTS");
    return;
}
else{
    do{
        System.out.println(temp.data + " ");
        temp=temp.next;
    }while(temp!=head);
}

    }
    public static void main(String[] args) {
        
        cifcular_linked_list_deletion_end deleteEnd = new cifcular_linked_list_deletion_end();
        deleteEnd.Addnode(10);
        deleteEnd.Addnode(12);
        deleteEnd.Addnode(8);
        deleteEnd.Addnode(14);
        deleteEnd.Addnode(6);
        System.out.println("ORIGINAL OUTPUT");
        deleteEnd.display();

        deleteEnd.deleteEnd();
        System.out.println("UPDATED OUTPUT");
        deleteEnd.display();
    }
}
