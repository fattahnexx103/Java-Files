import java.util.*;
public class stacks {
	public static void main(String[] args){
	
		//pushing means putting on top of stack
		//popping is taking off from stack
		
		Stack<String> stack = new Stack<String>();
		//creates an empty stack
		stack.push("bottom");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		
		//automatically takes the top off
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		
	}
	
	private static void printStack(Stack<String> s){
		if(s.isEmpty())
			System.out.println("you got nothing in stack");
		else
			System.out.printf("%s TOP\n", s);
	}
}
