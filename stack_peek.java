import java.util.*;

public class stack_peek {
    public static void main(String args[]) {

        // creating stack
        Stack st = new Stack();

        // populating stack
        st.push(1);
        st.push(2);
        st.push(3);

        // checking the top object
        System.out.println("Top object is: " + st.peek());
    }
}
