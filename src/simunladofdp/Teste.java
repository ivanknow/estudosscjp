package simunladofdp;

interface X{
	int foo();
}
public class Teste {
	
	public static void main(String[] args) {
		Teste t =  new Teste();
		t.testeX();
	}
class a implements X{

	@Override
	public int foo() {

		return 1;
	}
	
}

public void testeX(){
	/*class a implements X{

		@Override
		public int foo() {

			return 2;
		}
		
	}*/
	
	System.out.println(new a().foo());
}
	
}
