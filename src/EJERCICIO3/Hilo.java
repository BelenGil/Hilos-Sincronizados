package EJERCICIO3;

public class Hilo implements Runnable {
//y las prioridades????
	//Variables
	String ms;
	
	public Hilo (String msg) {
		this.ms = msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hilo: " + this.ms);
	}
	
}
