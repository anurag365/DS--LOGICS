
import java.util.*;

class Stack {

    int top;
    int MaxSize = 10;
    int arr[] = new int[MaxSize];
    Scanner sc = new Scanner(System.in);

    public void push() {
        if (top == MaxSize - 1) {
            System.out.println("It is overflow");
            return;
        } else {
            System.out.println("ENTER THE VALUE WHICH U HAVE TO INSERT");
            int val = sc.nextInt();
            top++;
            arr[top] = val;
            System.out.println("item pushed");
            return;

        }
        Void peek(){
        st.push(1);
        st.push(2);
        st.push(3);

        // checking the top object
        System.out.println("Top object is: " + st.peek());
        }

    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty or underflow");
            return;

        } else {
            top--;
            System.out.println("item popped");
            return;
        }
    }

   

    public void display() {
        for (int i = top; i >= 0; i--) {

            System.out.println("THE STACK IS " + arr[i]);
        }
    }

    
}

public class stack_implementation_array {
    public static void main(String args[]) {
        int choice = 0;
        Stack st = new Stack();
        Scanner sc = new Scanner(System.in);

        while (choice!=1) {
            System.out.println("Choose the option from below");
            System.out.println("\n1.push \n2.pop \n3.display \n4.peek \n5.exit");
            System.out.println("ENTER THE CHOICE");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    st.push();
                    break;

                }

                case 2: {

                    st.pop();
                    break;
                }

                case 3: {
                    st.display();
                    break;
                }


               
                case 5: {

                    System.exit(1);
                    System.out.println("EXITED SUCCESSFULY");

                    break;
                }

              

                default: {
                    System.out.println(".");
                }

            }

        }

    }
}
