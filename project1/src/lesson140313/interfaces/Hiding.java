package lesson140313.interfaces;

public class Hiding {
	
	public static void main(String[] args) {
		H h = new H();
		
		System.out.println(h.state);
		
		h.changeState();
		System.out.println(h.state);
	}
}
