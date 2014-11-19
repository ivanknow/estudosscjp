package estudosscjp;

public class Teste { 

public int somar (int a, int b){ 
	return  a + b; 
} 

public static void main(String[] args) { 

	byte b = 3; 

	switch (b) { 

	case 2 : System.out.println("2");

	default: System.out.println("default");

	case 127 : System.out.println("127");

	case -127 : System.out.println("-127");

	}


Teste teste = new Teste(); 

switch (teste.somar(2,2)) { 

case 2 : System.out.println("2"); 

case 4 : System.out.println("4"); 

case 10 : System.out.println("10"); 

} 

}

}