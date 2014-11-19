package cap12;

public class Wrappers {
	public static void main(String[] args) {
		System.out.println(Integer.valueOf("10",2));
		
		Integer i =100;
		Integer i2 = 100;
		if (i == i2) System.out.println("iguais 1"); 
		//imprime
		Integer ai = new Integer(100);
		Integer ai2 = new Integer (100);
		if (ai == ai2) System.out.println("iguais 2"); //não	imprime
		
		Boolean s = true;
		if(s){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
