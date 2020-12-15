package PracticaHilos;


public class Hilo implements Runnable{
	private int x, mSeg;

	public Hilo(int x, int mSeg) {
		this.x = x;
		this.mSeg = mSeg;
	}

	@Override
	public void run() {
		try {			
			System.out.println("Soy el hilo " + x + " y me pongo a dormir " + (mSeg / 1000) + " segundos.");
			Thread.sleep(mSeg);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("Soy el hilo " + x + " y he terminado de dormir.");
	}
			

}