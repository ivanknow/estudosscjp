package estudosscjp.name;

import estudosscjp.ModificadoresDeAcesso1;

public class Modificadores2 extends ModificadoresDeAcesso1 {
	
	public void test(){
		//System.out.println(a); //default n pega em hernaça
		System.out.println(b);
		System.out.println(c); //protected pega em herança 
		//System.out.println(d); //private
	}
	
	public static void main(String[] args) {
		ModificadoresDeAcesso1 m = new ModificadoresDeAcesso1();
		//System.out.println(m.a);
		System.out.println(m.b);
		//System.out.println(m.c);
		//System.out.println(m.d);
	}
	private class Cunha{ //private so innerclass
		
	}
}

/*private class Cunha{ //private so innerclass
	
}*/