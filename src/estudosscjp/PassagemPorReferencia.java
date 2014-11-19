package estudosscjp;

public class PassagemPorReferencia {

	public static void main(String[] args) {
		Tester t = new Tester();
		t.idade = 17;
		t.nome = "Weverton";
		
		usaNullNoObjeto(t);
		System.out.println(t.nome);
		
		usaNewNoObjeto(t);
		System.out.println(t.nome);
		
		mudaNome(t);
		System.out.println(t.nome);
		
	}
	
	static void usaNewNoObjeto(Tester r){
		r = new Tester();
	}
	
	static void usaNullNoObjeto(Tester t){
		t = null;
	}
	
	static void mudaNome(Tester t){
		t.nome = "Mirosmar";
	}
}

class Tester{
	public int idade;
	public String nome;
}