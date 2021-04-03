package ro.ase.cts.adapter.clase;

public class Bilet {
	private int pret;
	
	public Bilet(int pret) {
		this.pret = pret;
	}
	
	public void vinde() {
		System.out.println("A fost vandut biletul cu pretul " + this.pret);
	}
	
	public void rezerva() {
		System.out.println("A fost rezervat biletul cu pretul " + this.pret);
	}
}
