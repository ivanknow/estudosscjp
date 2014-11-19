package cap12;

public class Instancia {
	
	{
		//A2 a2 =(A2) new A();
	}
	public static void main(String[] args) {
		
		A a = new A();
		A a11 = new A2();
		A2 a2 = (A2)a11;
		
		A2 a22 = new A2();
		A a1 = a22;
		
		System.out.println(a instanceof A);
		System.out.println(a instanceof A2);
		System.out.println(a2 instanceof A);
		System.out.println(a2 instanceof A2);

		System.out.println(a22 instanceof A);
		System.out.println(a22 instanceof A2);
		
	}
}

class A {

}

class A2 extends A {

}