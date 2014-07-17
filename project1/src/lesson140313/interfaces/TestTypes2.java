package lesson140313.interfaces;

public class TestTypes2 {

	public static void main(String[] args) {
		
		Violin violin = new Violin();
		Object object = new Trombone();
		
		MusicInstrument mi = violin;
		
		((Trombone) object).clean();
//		((Violin) object).piccicato(); RUNTIME ERROR
		((Violin) mi).piccicato();
		
	}
	
}
