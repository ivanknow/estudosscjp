package cap131;

public class Interface {

}

interface Viadable{
	//public static e final
	int a=0;
	public static final int b = 9;
	void dar();
	void comer();
}

interface Gayzable extends Viadable,Comparable<Gayzable>{}

class Goy implements Gayzable{

	@Override
	public void dar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Gayzable arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}