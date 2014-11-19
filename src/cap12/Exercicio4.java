package cap12;

public class Exercicio4 {
public static void main(String[] args) {
	Almir a2 = new B();
	a2.foo("teste");
	B b = (B) a2;
	b.foo("teste");
	
	
}
}

class Almir{
	public void foo(String...args){
		System.out.println("pai");
	}
	
	
}

class B extends Almir{
	private Tx t;
	public void foo(String args){
		System.out.println("filho");
		try{
			System.out.println(this.t.filho);
		}catch(RuntimeException e){
			System.out.println("opa 2");
			
		}
		catch(Exception e){
			System.out.println("opa 3");
		}
		finally{
			System.out.println("alo");
		}
		
		System.out.println("a exceção foi tratada então chega aqui");
	}
	
public void teste(){
		
	}
}

class Tx{
	Tx filho;
}