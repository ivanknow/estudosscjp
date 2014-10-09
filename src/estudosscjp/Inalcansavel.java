package estudosscjp;

public class Inalcansavel {
public static void main(String[] args) {
	//compila, mas da aviso
	if(false){
		System.out.println("kkk");
	}else{
		System.out.println("kkk4");
	}
	//não compila
	/*while(false){
		System.out.println("kkk");
	}*/
	boolean k = false;
	if(k){
		System.out.println("kkk2");
	}
	//não compila
	while(k){
		System.out.println("kkk3");
	}
	System.out.println("calma");
}
}
