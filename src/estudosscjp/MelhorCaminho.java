package estudosscjp;

public class MelhorCaminho {

	public void soma(int a,int b){
		System.out.println("metodo simples");
	}
	
	public void soma(int ... a){
		System.out.println("metodo nao simples");
	}
	
	public static void main(String[] args) {
		new MelhorCaminho().soma(1,2,3);
	}

}
