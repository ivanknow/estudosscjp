package cap12;

import java.io.EOFException;
import java.io.IOException;

interface Alfa {

	int dia();
}

public class Exercicio123 {
	public static void main(String[] args) {
		Car ferrari = new Car();
		ferrari.fazAlgo();
		((Ferrari) ferrari).fazAlgoMais();

		// Ferrari f = (Ferrari)new Car();
	}
}

class Car implements Alfa {
	void fazAlgo() {
		System.out.println("faz algo car");
	}

	@Override
	public int dia() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Ferrari extends Car implements Alfa {
	void fazAlgo() {
		System.out.println("faz algo ferrari");
	}

	void fazAlgoMais() {
		System.out.println("faz algo mais ferrari");
	}
}

/*class TestA {
	public void methodA() throws IOException {
		// do some file manipulation
	}
}

class TestB1 extends TestA {
	public void methodA() throws EOFException {
		// do some file manipulation
	}
}

class TestB2 extends TestA {
	public void methodA() throws Exception { // WRONG
		// do some file manipulation
	}
}*/