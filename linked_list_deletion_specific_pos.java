
public class linked_list_deletion_specific_pos {

    class node{
        int data;
        node next;

        public node(int node){
            this.data=data;
            this.next=null;
        }
    }

    public node head=null;
    public node tail=null;

    public void Addnode(int data){
        node Newnode =new node(data);
        if(head==null){
            head=Newnode;
            tail=Newnode;
        }
        else{
            tail.next=Newnode;
            tail=Newnode;
        }
    }

    public void deleteAtPos(int node){

        node Newnode= new node( node);
        if(head==null){
            head=Newnode;
            tail=Newnode;
        }
        else{
            node temp=head;
            
            
            for(int i=0;i<node-1;i++){
                node next = temp.next.next;
 
                temp.next = next;

            }
        }
    }

    // public void deleteFromStart() {
    //     if (head == null) {
    //         System.out.println("LIST IS EMPTY");
    //         return;
    //     }

    //     if(head != tail) {  
    //         head = head.next;  
    //     }  
        
    //     else {  
    //         head = tail = null;  
    //     }  
    // }  
 
    // public void deleteFromEnd(){
    //     if(head==null){
    //         System.out.println("LIST IS EMPTY");
    //     }
    //     else{
    //         node temp = head;
    //         while(temp.next!= tail){
    //             temp = temp.next;
    //         }
    //         temp.next=null;
    //         tail=temp;
    //     }


    // }

    public void display(){
        node current = head;
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        else{

            while(current!=null){
            System.out.println(current.data + " ");
            current = current.next;
            }
        }
    }


    public static void main(String[] args){
        linked_list_deletion_specific_pos pos =new linked_list_deletion_specific_pos();
        pos.Addnode(26);
        pos.Addnode(6);
        pos.Addnode(256);
        pos.Addnode(265);
        pos.Addnode(2664);
        pos.Addnode(2655);

        System.out.println("ORIGINAL LIST");
        pos.display();

        // pos.deleteFromStart();
        // System.out.println("AFTER DELETION FROM START");
        // pos.display();


        // pos.deleteFromEnd();
        // System.out.println("AFTER DELETION FROM END");
        // pos.display();

        pos.deleteAtPos(3);
        System.out.println("AFTER DELETION FROM SPECIFIC POSITION");
        pos.display();



    }
}
