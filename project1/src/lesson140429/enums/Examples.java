package lesson140429.enums;

public class Examples {
	
	enum Apple{
		Jonathan, GoldenDel, RedDel, Winesap, Cortland
	}
	
	enum �������������{
		���������(10), ���������(15), ���������������(20);
		
		private int ����;
		
		�������������(int ����){
			this.���� = ����;
		}
		
		public int ���������(){
			return ����;
		}
	}
	
	public static void main(String[] args) {
		
		Apple ap = Apple.Jonathan;
		
		System.out.println(ap.name());
		System.out.println(Apple.RedDel.ordinal());
		
		switch(ap){
			
		case Jonathan:
			break;
		case RedDel:
			break;
		
		}
		
		for (Apple apple : Apple.values()) {
			System.out.println(apple.name() + " " + apple.ordinal());
			
		}
		
		for (������������� ��������� : �������������.values()){
			System.out.println(���������.name() + " " + ���������.���������());
		}
	}
}
