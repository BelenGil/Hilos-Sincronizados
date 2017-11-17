package EJERCICIO3;

public class Principal {
	
	public static void main(String[] args) {
		
		//Creamos hilos
		Thread hl1 = new Thread(new Hilo("PRS1"));
		Thread hl2 = new Thread(new Hilo("PRS2"));
		Thread hl3 = new Thread(new Hilo("PRS3"));
		Thread hl4 = new Thread(new Hilo("PRS4"));
		Thread hl5 = new Thread(new Hilo("PRS5"));
		
		//Establecer prioridades
		hl1.setPriority(1);
		hl2.setPriority(2);
		hl3.setPriority(5);
		hl4.setPriority(8);
		hl5.setPriority(10);

		//Inicia procesos
		hl1.start();
		hl2.start();
		hl3.start();
		hl4.start();
		hl5.start();
		
	}

}
