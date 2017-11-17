package EJERCICIO4;

public class Principal {
	
	public static void main(String[] args) {
		Mensajes mns = new Mensajes();
		
		//Crear Hilos
		Thread hl1 = new Thread(new Amaneciendo(mns));
		Thread hl2 = new Thread(new Adescansar(mns));
		
		//Iniciar procesos
		hl1.start();
		hl2.start();
	}

}