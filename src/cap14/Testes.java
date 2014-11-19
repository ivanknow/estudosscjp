package cap14;

public class Testes {
	static int q;
	{
		try{
		q = Integer.parseInt("bubafina");
		Object o = null;
		System.out.println(o.toString());
		}catch(Throwable e){
			System.out.println(e.getCause());
		}
	}
	public static void main(String[] args) {
		Testes t =  new Testes();
		Exemplo e = new Exemplo();
		System.out.println("pica");
	}
}

class Exemplo {
	public static Exemplo e;
	public void fucuda() throws NullPointerException {
		
	}
	
}

class E2 extends Exemplo {
	public void fucuda() throws ClassCastException {
		if (true) {
			System.out.println("opa");
		} else {
			System.out.println("");
		}
	}
}
