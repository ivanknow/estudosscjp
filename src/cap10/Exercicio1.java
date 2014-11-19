package cap10;

public class Exercicio1 {
	public static void main(String[] args) {
		
		short s = 10,s2 = 4,s3;
		
		long l = 10L;
		Yankes.foo(s);
		Yankes.foo(l);
		s3 = (short)(s+s2);
		System.out.println(s+s3);
		
		A a = new A();
		A b = new B();
		
		System.out.println(a.name+a.classname());
		System.out.println(((B)b).name+b.classname());
	}
}

class Plant {
	public Plant(String t) {

	}

	public Plant() {
		this("");
	}

}

class Tree extends Plant {

}

class A{
	String name = "A";
	String classname(){
		return "class A";
	}
}

class B extends A{
	String name = "B";
	String classname(){
		return "class B";
	}
}

class Yankes {
	public static void foo(Long l) {
		System.out.println("L");
	}

	public static void foo(Short s) {
		System.out.println("S");
	}

	public static void foo(int i) {
		System.out.println("i");
	}
}

class Hello{
	String title;
	public Hello(){
		this.title += "World";
	}
	
	public Hello(String a){
		this();
		this.title = a;
		
	}
}

class One{
	public One foo(){return this;}
}

class Two extends One{
	public One foo(){return this;}
}

class Three extends Two{
	public Two foo(){return this;}
}

class X{
	public void doit(){}
	//public String doit(){}
}