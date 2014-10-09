package estudosscjp;

public class MetodoMain {
//tem q ser publico para poder ser chamado
//tem que ser estático, pois não precisa de instancia
//tem que ser void pois não retorna nada
//O argumento deve ser uma array de strings
//todos certos: main(String[] args),main(String args[]),(String...args),main(String ... args)
//O identificador do argumento não precisa ser args
	public static void main(String arssgs[]) {
		main("");
		if(arssgs.length!=0){
			System.out.println(arssgs[0]);
			int çã = 3;
			System.out.println(çã);
		}
		
		Carro p = new Carro();
		System.out.println(p.antigo);

	}
	public static void main(String args) {
		System.out.println("bom dia mamae");

	}

}

class Carro{
	String placa;
	Carro antigo;
}
