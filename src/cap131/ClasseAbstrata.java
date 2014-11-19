package cap131;

public abstract class ClasseAbstrata {
	public static void main(String[] args) {
		System.out.println("que merda eim?");
		ClasseAbstrata c =  new Classe();
		System.out.println(c.teste(2, 2));
	}
	//n pode ser static ou final, nem private
	public abstract int teste(int x,int y);
}

class Classe extends ClasseAbstrata{

	@Override
	public int teste(int x, int y) {
		return x+y;
	}
}

abstract class ClasseAbestada extends ClasseAbstrata{}
