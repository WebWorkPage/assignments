package Task4_Exception;

import java.util.EmptyStackException;
import java.util.Stack;

public class stack {
	Stack<Integer> s;
	
	public stack() {
		this.s=new Stack<>();
	}
	
	public Stack<Integer> addElements(int ele){
		this.s.push(ele);
		return s;
	}
	
	public Stack<Integer> popElements(int ele){
		try {
			this.s.pop();
		}
		catch(EmptyStackException e) {
			System.out.print(e.getMessage());
		}
		finally {
			return s;
		}
	}
	
	public boolean checkEmpty() {
		return s.isEmpty();
	}

	public static void main(String[] args) {
		stack obj = new stack();
		Stack<Integer> a=obj.addElements(1);
		System.out.println("after pushing ele to stack "+a);
		Stack<Integer> b=obj.popElements(1);
		System.out.println("after removing ele from stack "+b);
		boolean check = obj.checkEmpty();
		System.out.println("check for empty stack "+check);
	}

}
