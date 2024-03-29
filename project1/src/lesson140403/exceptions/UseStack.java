package lesson140403.exceptions;

public class UseStack {

	public static void main(String[] args) {
		Stack stack = new Stack(3);
		
		stack.pop();
		
		try {
			stack.push("one");
			stack.push("two");
			stack.push("three");
			stack.push("four");
		} catch (StacOverflow e) {
			System.out.println("Stack is too small");
		}
	}
}
