package estudosscjp;

public class Asserta {
	boolean b = true;
	private void bomba(){
		boolean b = true;
		assert(b):"opa";
	}
	
	public void bomba2(){
		
		assert(b):"opa";
		System.out.println("so what?");
	}
}
