package estudosscjp;

import java.util.Arrays;


public class TesteCu {

	public static void main(String[] args) {
		
		int[] numeros = {2,5,15,50,80};
		//-1
		System.out.println(Arrays.binarySearch(numeros,1));
		//-2
		System.out.println(Arrays.binarySearch(numeros,3));
		//-2
		System.out.println(Arrays.binarySearch(numeros,4));
		//-6
		System.out.println(Arrays.binarySearch(numeros,100));
		//3
		System.out.println(Arrays.binarySearch(numeros,50));
	}

}
