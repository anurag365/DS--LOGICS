import java.util.Scanner;
import java.util.Stack;


public class stack_emptyornot {
    public static void main(String args[]) {

        Stack stk = new Stack();
        boolean result = stk.empty();
        System.out.println("IS STACK EMPTY " + result);

        
        stk.push(1);
        stk.push(10);
        stk.push(15);
        stk.push(155);
        stk.push(166);
        stk.push(18);

        System.out.println("ELEMENTS ARE" + stk);
        result=stk.empty();
        System.out.println("IS STACK EMPTY " + result);
        
        



    }

}
