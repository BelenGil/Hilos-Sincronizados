package EJERCICIO4;

public class Mensajes {

	//Semáforo!
	boolean amaneciendo = true;
	
	synchronized void amaneciendo() {
		if (!amaneciendo) {
			try {
				//Espera
				wait();
			}catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Se ha interrumpido la espera");
			}
		}
		//Continua ejecucción
		System.out.println("Amaneciendo");
		amaneciendo = false;
		notify();
	}
	
	synchronized void aDescansar() {
		if (amaneciendo) {
			try {
				//Espera
				wait();
			}catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Se ha interrumpido la espera");
			}
		}
		//Continua ejecucción
		System.out.println("Buenas noches, a descansar");
		amaneciendo = true;
		notify();
	}
}
