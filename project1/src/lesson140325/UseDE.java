package lesson140325;

public class UseDE {

	public static void main(String[] args) {
		D d = new D();
		E e = new E();
		A a = new A();
		
		use(d);
		use(a);
		use(e);
		use(new C2());
	}

	private static void use(Changeable object) {

//		if(object instanceof D){
//			D d = (D)object;
//			d.changeState();
//			return;
//		}
//		if(object instanceof E){
//			E e = (E)object;
//			e.changeState();
//			return;
//		}
//		if(object instanceof A){
//			A a = (A)object;
//			a.changeState();
//			return;
//		}
		
		object.changeState();
	}
}
