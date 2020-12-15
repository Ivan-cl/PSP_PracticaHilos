package PracticaHilos;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
			
			ArrayList<Thread> threads= new ArrayList<Thread>();

			Cartera carteraVacia = new Cartera(0);
			for (int x=0; x<10;x++) {
			Client clienteNuevo = new Client(x, carteraVacia);
			Thread threadClienteNuevo = new Thread(clienteNuevo);
			threads.add(threadClienteNuevo);
			
			Worker workerNuevo = new Worker(x, carteraVacia);
			Thread threadWorkerNuevo = new Thread(workerNuevo);
			threads.add(threadWorkerNuevo);
			}
		
		
		for(Thread thread : threads) {
			thread.start();		
		}
				
		
	}

}