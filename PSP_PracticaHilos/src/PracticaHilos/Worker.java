package PracticaHilos;

import java.util.Random;

public class Worker implements Runnable{
	
	private Cartera cartera;
	private Random azar = new Random();
	private boolean infinito = true;
		

	public Worker(int id, Cartera cartera) {
		this.cartera = cartera;
	}

	public void run() {
		try {	
			while(infinito) {
				Thread.sleep(1000);
				int azarDinero = azar.nextInt(100);
				cartera.decrementarDinero(azarDinero);
				System.out.println("Se han reducido " + azarDinero + "€ de tu cartera  " 
				+".\nAhora tienes " + cartera.mostrarDinero() + "€ en tu cartera ");
			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}

}