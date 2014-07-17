package lesson140401.localinner;

import lesson140313.interfaces.SimpleList;
import lesson140313.interfaces.MyList;

public class LocalInner {

	interface Jumper{
		void Jump();
	}
	
	
//	static class Twins{
//		Jumper elder;
//		Jumper junior;
//	}
	
	public static void main(String[] args) {
		SimpleList jumpers = createJumpers();
		for (Object object : jumpers) {
			Jumper jumper = (Jumper) object;
			jumper.Jump();
		}
	}

	private static SimpleList createJumpers() {
		SimpleList jumpers = new MyList();
	
		 class Person implements Jumper{
			String name;
			
			Person(String name){
				this.name = name;
			}
			@Override
			public void Jump() {
				System.out.println(name + " jumps!");
			}
		}
		 
		jumpers.add(new Person("John"));
		jumpers.add(new Person("Pete"));
		jumpers.add(new Person("Jane"));
		
		return jumpers;
	}
}

