package lesson140313.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class TestInterfaces {

	public static void main(String[] args) {
		String s = "hello";
	
		MusicInstrument trombone = new Trombone();
		Violin violin = new Violin();
	
		StringInstrument si = new Violin();
		MusicInstrument mi = new Violin();
		Object o = new Violin();
		Cleanable cleanable = new Violin();
		
		violin.piccicato();
//		si.piccicato(); ERROR

		ArrayList<MusicInstrument> list = new ArrayList<MusicInstrument>();
		ArrayList<Cleanable> cleanables = new ArrayList<Cleanable>();
		list.add(violin);
		list.add(trombone);
		cleanables.add(violin);
		cleanables.add(trombone);
		cleanables.add(cleanable);
		cleanables.add(si);
		cleanables.add(mi);
		cleanables.add(new Table());
//		cleanables.add(o); ERROR
		play(list);
		clean(cleanables);
	
	}

	private static void play(ArrayList<MusicInstrument> instruments) {
		for (MusicInstrument musicInstrument : instruments) {
			musicInstrument.play();
		}
	}
	
	private static void clean(ArrayList<Cleanable> cleanableObjects) {
		for (Cleanable dirtyObject : cleanableObjects) {
			dirtyObject.clean();
		}
	}
}
