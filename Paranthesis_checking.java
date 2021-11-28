import java.util.*;

public class Paranthesis_checking {
	public static boolean areParenthesisBalanced(char exp[]) {

		public boolean push() {
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
	


		Stack st = new Stack();
		for (int i = 0; i < exp.length; i++) {
        if(exp[i]=='{' || exp[i]=='(' || exp[i]=='['){
			st.push(exp[i]);


		}

		if(exp[i]=='}' || exp[i]==')' || exp[i]==']'){

			if(st.isEmpty()){

				return false;
			}

			else if (!isMatchingpair(st.pop(),exp[i])){
				return false;
			}
		}
			
		}
	}
}

