package cap131;

public class Final {
	public static void main(String[] args) {
		final int f = 3;
		new Animal().contar(0, new Animal());
	//	f+=4;
	}
	
}

class Animal{
	public String name;
	public final void fazerCoco(){
		System.out.println("Ploc");
	}
	
	public void contar(final int x,final Animal xf){
		//x++;
		xf.name = "potro";
		//xf = new Animal();
	}
}

final class Cachorro extends Animal{
//	public void fazerCoco(){}
}

//class Beagle extends Cachorro{}