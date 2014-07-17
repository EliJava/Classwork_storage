package lesson140313.interfaces;

import java.util.Iterator;

import lesson140313.interfaces.MyList.Node;

public class MyIterator implements Iterator{

	MyIterator (Node first){
		nextElement = first;
	}
	private Node nextElement;
	
	@Override
	public boolean hasNext() {
		return nextElement != null;
	}

	@Override
	public Object next() {
		Object data = nextElement.data;
		nextElement = nextElement.next;
		
		return data;
	}

	@Override
	public void remove() {
		
	}

}
