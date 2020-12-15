package PracticaHilos;

import java.util.ArrayList;
import java.util.Random;


public class CienHilos {

	public static void main(String[] args) {
		ArrayList<Thread> arrayThreads = new ArrayList<Thread>();
		Random azar = new Random();
		
		for(int x = 0; x<100; x++) {
			int azarSegundos = azar.nextInt(5) + 1;
			azarSegundos = azarSegundos * 1000;			
			Hilo hilo = new Hilo(x, azarSegundos);
			
			Thread thread = new Thread(hilo);
			
			arrayThreads.add(thread);
		}
		
		for(int x = 0; x<100; x++) {
			arrayThreads.get(x).start();
		}
		
	}

}