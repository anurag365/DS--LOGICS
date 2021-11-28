
import java.util.Scanner;
import java.util.Stack;
public class stack {
    
    public static void main(String[] args)
    {
    Stack<String> stk =new Stack<>();
    stk.push("WELCOME");
    stk.push("TO");
    stk.push("ANURAG");
    stk.push("ENTERPRISES");
    System.out.println(stk.peek()); //used to show on which element what is the value 
    System.out.println(stk); // used for display
    stk.pop();
    System.out.println(stk); // used for display
    System.out.println(stk.search("TO"));//used for searching in stack
    System.out.println(stk.isEmpty());//CHECKS WHETHER THE STACK IS EMPTY
    System.out.println(stk.firstElement());//Checks which is the first element
    stk.clear();//clears all the stack
    }

}
