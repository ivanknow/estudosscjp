package cap131;

public class ClasseInternaEstatica {
public static void main(String[] args) {
	ClasseInternaEstatica.Bola b = new ClasseInternaEstatica.Bola();
	ClasseInternaEstatica.Quadrado q = new ClasseInternaEstatica().new Quadrado();
	Runnable r = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	};
}

public static class Bola{}
public class Quadrado{}
}
