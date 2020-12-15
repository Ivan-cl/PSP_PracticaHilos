package PracticaHilos;

public class Cartera {

	private double dinero;	
	
	public Cartera(double dinero) {
		
		this.dinero = dinero;
	}

	public synchronized void incrementarDinero(double cantidadTotal) {
		dinero = dinero + cantidadTotal;
	}
	
	public synchronized void decrementarDinero(double cantidadTotal) {
		dinero = dinero - cantidadTotal;
	}
	
	public synchronized double mostrarDinero() {
		return dinero;
	}
	
	
}