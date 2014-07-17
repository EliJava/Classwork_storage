package lesson140408.classwork;

import lesson140408.exceptions.List;

public class Queue extends List {
	public static class QueueOverflow extends Exception {

		private Object _item;

		public QueueOverflow(Object item) {
			_item = item;
		}
		public Object getItem(){
			return _item;
		}

	}

	public static class QueueUnderflow extends Exception {

	}

	int count;
	private int _maxsize;
	public Queue(int maxsize){
		_maxsize = maxsize;		
	}
	
	
	public void put(Object item) throws QueueOverflow{
		if(count == _maxsize){
			throw new QueueOverflow(item);
		}
		super.add(item);
		count++;
	}
	
	@Override
	public void add(Object item) {
		throw new UnsupportedOperationException();
	}
	
	public Object take() throws QueueUnderflow{
		Object result = null;
		
		if (first == null){
			throw new QueueUnderflow();
		}
		
		result = first.data;
		first = first.next;
		
		count--;			
		
		return result;
	}
	
	public Object head(){
		return first == null? null:first.data;
	}
	
	public Object tail() throws QueueUnderflow{
		if(last == null){
			throw new QueueUnderflow();
		}
		return last.data;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int size(){
		return count;
	}
	
	public static void main(String[] args) {
		Queue q = new Queue(1);
		
		q.head();
		
		try {
			q.put("one");
			q.put("two");
		} catch (QueueOverflow e) {
			System.out.println("queue is full, can't put " + e.getItem());
		}
	}
}
