package estudosscjp;

import java.util.Arrays;
import java.util.List;

public class Repeticoes {
	
	public static void main(String[] args) {
		int a = 3;
		switch(a){
		case 1:
			System.out.println("1");
		case 2 : 
			System.out.println("2");
			
		case 3:
			System.out.println("3");

		default:
			System.out.println("default");
		}
	
		label:for(;;){
			System.out.println("começa for de fora");
			for(int i=1;i<10;){
				i++;
				System.out.println("começa for de dentro");
				if(i==8){
					System.out.println("chama o break");
					break label;
				}
				if(i==4){
					System.out.println("chama o continue");
					continue;
				}
				System.out.println(i);
				}
		}
		
		
		Integer[] spam = new Integer[] { 1, 2, 3 };
		List<Integer> list = Arrays.asList(spam);
		for(int x:list){
			//list.remove(0); não pode mecher na listra no foreach
			System.out.println(x);
		}
		
		
	}

}
