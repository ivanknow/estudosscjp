package estudosscjp;

import java.util.ArrayList;
import java.util.List;

public class Contrutores1 {
public static void main(String[] args) {
	new SuperHomem();
	new Homem(10, "nome");
	
	List <Homem> l = new ArrayList<Homem>();
	System.out.println(new SuperHomem().b);
	System.out.println(1+2+""+2+1);
	char contador = 0x234;

	String nome = "Pedro"; 
	nome.concat("teste");
	System.out.println(nome);
	int i = 0; 

	boolean t = true; 

	boolean f = false, b; 

	b = (t && ((i++) == 0)); 

	b = (f && ((i+=2) > 0)); 

	System.out.println(i);

}
}

class Homem{
	private int a;
	private  Homem(int idade) {
		System.out.println("pai");
	}
	
	public Homem(int idade,String s) {
		this(10);
		System.out.println("pai"+s);
		
	}
	
	//não é construtor
	public void Homem(){
		System.out.println("pegadinha do malandro");
	}
}


class SuperHomem extends Homem{
	public Integer b;
	private Integer a;
	public SuperHomem(){
		
		super(10,"s");
		System.out.println("filho");
	}
}