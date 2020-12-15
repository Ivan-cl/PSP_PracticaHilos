package PracticaHilos;

import java.util.Random;

public class Client implements Runnable{

	private Cartera cartera;
	private Random azar = new Random();
	private boolean infinito = true;
	
	public Client(int id, Cartera cartera) {
		this.cartera = cartera;
	}

	public void run() {
		try {		
			while(infinito) {
				Thread.sleep(1000);
				int azarDinero = azar.nextInt(100);
				cartera.incrementarDinero(azarDinero);
				System.out.println("Se han incrementado " + azarDinero + "€ a tu cartera  " 
				+ 	".\nAhora tienes " + cartera.mostrarDinero() + "€ en tu cartera ");

			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}


	
	
}
