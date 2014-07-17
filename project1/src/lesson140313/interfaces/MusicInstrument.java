package lesson140313.interfaces;

public abstract class MusicInstrument implements Cleanable {

	public abstract void play();
	public abstract void crash();
	
	@Override
	public void clean() {
		System.out.println("clean " + getClass().getSimpleName());
	}
	
}
