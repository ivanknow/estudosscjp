package estudosscjp;

public class PullDeString {
	
	public static void main(String[] args) {
		String a="teste";
		String b = "teste";
		String c = new String("teste");
		
		if(a==b){
			System.out.println("ponteiros iguais na inicialização do pull");
		}else{
			System.out.println("cagada");
		}
		if(c!=a){
			System.out.println("ponteiros diferentes na inicialização com new");
		}else{
			System.out.println("cagada");
		}
		
		c = "teste";
		
		if(c==a){
			System.out.println("ponteiros iguai na inicialização com new");
		}else{
			System.out.println("cagada");
		}
		
		
		String d = a;
		d = "aventuras";
		
		System.out.println(a);
	}
}
