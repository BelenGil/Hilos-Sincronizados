package EJERCICIO4;

public class Adescansar implements Runnable{
	
	//Variables
	Mensajes msg;
		
	public Adescansar(Mensajes m) {
		this.msg = m;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<5; i++) {
			msg.amaneciendo();
		}
		
		//Mensaje final de la semana
		System.out.println("Otra semana de clases acabadas!");
	}

}