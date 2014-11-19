package estudosscjp;

public class Estatico {
int a;
	public static void metodoEstatico() throws RuntimeException{
		new Estatico().a =3;
	}
	
	private void metodoEstatico(int a) throws NullPointerException{
		new Estatico().a =3;
	}
	
	
	public static void main(String[] args) {
		Estatico j = new Estatico();
		j.metodoEstatico();
	}
}
