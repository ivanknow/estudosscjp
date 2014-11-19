package estudosscjp;

public class BlocoEstatico {
	public static int contador = 2; 
	public Object alpha;
	{
		System.out.println("Opa:"+contador);
		
	}
	
	public BlocoEstatico(){
		//System.out.println("Beleza:"+(contador+(Integer)alpha));
		System.out.println("Beleza:"+(contador));
		float t = 4.8F;
		boolean j = true;
		if(2<4){
			int contador = 4;
		}
	}
	public static void main(String[] args) {
		BlocoEstatico b = new BlocoEstatico();
		System.out.println("teste");
		byte bf =(byte) 300,g=5,y;
		y =(byte) (g+bf);
		System.out.println(y);
		
		int i = (int)4444.4444;
		System.out.println(i);
		
		
		short a,d,c;
		a = 4;
		d = 5;
		c =(byte) (a + d);
		
		
	}
}
