package lesson140701;

public class CasCounter {

	private SimulatedCAS value;
	
	public int getValue(){
		return value.get();
	}
	
	public int inc(){
		int v;
		
		do{
			v = value.get();
		}while (v != value.compareAndSwap(v, v + 1));
		
		return v + 1;
	}
	
}
