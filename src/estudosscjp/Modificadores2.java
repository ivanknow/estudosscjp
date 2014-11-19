package estudosscjp;

public class Modificadores2 {
	public static void main(String[] args) {
		ModificadoresDeAcesso1 m = new ModificadoresDeAcesso1();
		System.out.println(m.a); //default - ok nos pacotes
		System.out.println(m.b); //public
		System.out.println(m.c); //protected - ok nos pacotes e na herança
		//System.out.println(m.d); //private
	}
}
