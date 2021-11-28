import java.util.Scanner;
import java.util.Stack;

public class IsEmpty_in_stack {
    public static void main(String[] args){
        int MaxSize=5;
        int arr[]=new int[MaxSize];
          Stack<String> stk =new Stack<>();
          stk.push("WELCOME");
          stk.push("TO");
          stk.push("WORLD");
          stk.push("OF");
          stk.push("DISCIPLINE");
          System.out.println("Stack is " + stk);
          System.out.println("Stack is " + stk.isEmpty());
          System.out.println("Stack is " + stk.peek());
          System.out.println("stack is " + stk.stacktop()); 
          stk.clear();
          System.out.println("stack is " + stk);
          System.out.println("Stack is " + stk.isEmpty());




    }
}
