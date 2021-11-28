import java.util.Scanner;

 public class circular_linked_list_deletion_specific_pos {
     class node{
         int data;
         node next;

         public  node(int data){
             this.data=data;
             this.next=null;
         }
     }

     public node head=null;
     public node tail=null;
     int size=0;

     public void Addnode(int data){
         node Newnode =new  node(data);
         if(head==null){
             head=Newnode;
             tail=Newnode;
             Newnode.next=head;
             size++;
         }else{
             tail.next=Newnode;
             tail=Newnode;
             tail.next=head;
             size++;

         }
     }

    //  public void  Deletebeginning(){
    //     if(head==null){
    //         System.out.println("LIST IS EMPTY");
    //         return;
    //     }else{
    //         if(head!=tail){
    //             head=head.next;
    //             tail.next=head;
    //         }else{

    //             head=tail=null;
    //         }
            
    //     }

    // }

    // public void deleteEnd(){
    //     if(head==null){
    //         System.out.println("SORRY,AN ERROR OCCURED");
    //         return;
    //     }else{
    //         node temp=head;
    //         while(temp.next!=tail){
    //             temp=temp.next;
    //         }
    //         temp.next=null;
    //         tail=temp;
    //         tail.next=head;
    //     }

    // }

    // public void DeletespecficPos(int node){
        
    
        
    //     if(head==null){
    //         System.out.println("LIST IS EMPTY");
    //     }else{
    //         node temp=head;
    //         for(int i=0;i<node-1;i++){
    //             temp=temp.next;

    //         }
    //        node t1=temp.next;
    //        temp.next=t1.next;
            
            
           
    //     }
    // }

    public void Insertbeginning(int data) {
        node Newnode = new node(data);
        if (head == null) {
            head = Newnode;
            
            tail = Newnode;
            Newnode.next=head;
            size++;

        } else {
            
           
            Newnode.next=head;
            head=Newnode;
            tail.next=Newnode;
            size++;



        }

    }

    public void InsertEnd(int data) {
        node Newnode = new node(data);
        if (head == null) {
            head = Newnode;
            
            tail = Newnode;
            Newnode.next=head;
size++;
        } else {
            
            tail.next=Newnode;
            tail=Newnode;
            tail.next=head;
            size++;



        }

    }

    public void insertAtspecificPos(int node,int pos){
        node Newnode=new node(node);
        if(pos==1){
            Insertbeginning(node) ;

        }

        else if (pos==size+1){
            InsertEnd(node);
             

        }
         else{
             node temp=head;
             for(int i=1;i<pos-1;i++){
                 temp=temp.next;
             }

             node t1=temp.next;
             t1=t1.next;
         }

        }
    

    

    public void display(){
        node temp = head;
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        else{

           do{
               System.out.println(temp.data + " ");
               temp=temp.next;
           }while(temp!=head);

        }
    }


    // public void display() {
	// 	node t = head;
	// 	for (int i = 1; i <= size; i++) {
	// 		System.out.println(t.data + " ");
	// 		t = t.next;
	// 	}
	// 	System.out.println();
	// }

  
    
    public static void main(String[] args)
    {
        circular_linked_list_deletion_specific_pos delspec = new circular_linked_list_deletion_specific_pos();

        delspec.Addnode(2);
        delspec.Addnode(4);
        delspec.Addnode(14);
        delspec.Addnode(10);
        delspec.Addnode(12);
        delspec.Addnode(20);
        // delspec.Deletebeginning();
        System.out.println("ORIGINAL LIST");
        delspec.display();

        //  delspec.DeletespecficPos(3);
        // System.out.println("UPDATED LIST");
        // delspec.display();

        // delspec.deleteEnd();
        // System.out.println("ORIGINAL LIST");
        // delspec.display();

        delspec.insertAtspecificPos(45, 3);
        System.out.println("INSERION AT SPECIFI POS");
        delspec.display();


   
    }
}
