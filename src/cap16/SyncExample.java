package cap16;

import java.util.ArrayList;

public class SyncExample implements Runnable{
	public int valor;
	private Repositorio r;
	@Override
	public void run() {
		for(int valor=0;valor<10;valor++)
		r.addElemento(this.valor);
		r.printRepo();
	}
	
	public SyncExample(int valor,Repositorio r) {
		this.valor = valor;
		this.r = r;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Repositorio r = new Repositorio();
		Thread t = new Thread(new SyncExample(1,r));
		Thread t2 = new Thread(new SyncExample(3,r));
		
		t.start();
		t2.start();
		
		
		
	}
	
}

class Repositorio{
	private ArrayList<Integer> inteiros;
	public Repositorio() {
		inteiros = new ArrayList<Integer>();
	}
	public void addElemento(Integer i){
		synchronized(this){
		inteiros.add(i);
		}
	}
	
	public void printRepo(){
		for(int i:inteiros)
		System.out.println(i);
	}
	
}