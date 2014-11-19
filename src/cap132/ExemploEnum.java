package cap132;

public class ExemploEnum {
	public static void main(String[] args) {
		cor c = cor.azul;
		switch(c){
		case azul:
			System.out.println("Cor azul");
			break;
		case verde:
			System.out.println("Palmeiras");
		break;
		}
		
		if(cor.azul == c){
			System.out.println("igualdade");
		}
	}
}
enum cor{
	azul,vermelho,branco,verde
}
enum Race{
	
	negro("Negro"),branco("Branco"),pardo("Pardo");
	public String race;
	Race(String race){
		this.race = race;
	}
}