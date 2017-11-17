package EJERCICIO4;

public class Amaneciendo implements Runnable{
	
	//Variables
	Mensajes msg;
	
	public Amaneciendo(Mensajes m) {
		this.msg = m;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<5; i++) {
			msg.amaneciendo();
		}
	}

}
