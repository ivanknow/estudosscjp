package estudosscjp;

import static java.lang.System.*;
import static estudosscjp.BlocoEstatico.*;

public class SobrecargaEmHeranca {

	public static void olho() {
		System.out.println("Eye Ball");
	}
	public SobrecargaEmHeranca(){
		System.out.println("chamado segundo");
	}
	{
		this.olho();
	}

	public static void main(String[] args) {
		Dog p = new Poodle();
		p.latir();
		System.out.println(contador);
		new SobrecargaEmHeranca();

	}
}

class Dog {
	public void latir() {
		out.println("Auau");
	}

	public static void test() {
		System.out.println("explode");
	}
}

class Poodle extends Dog {
	public void latir() {
		out.println("Ainhen");
	}
}