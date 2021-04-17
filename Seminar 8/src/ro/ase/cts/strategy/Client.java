package ro.ase.cts.strategy;

public class Client {
	private String nume;
	private ModPlata modPlata;
	
	public Client(String nume) { 
		this.nume = nume;
		this.modPlata = new PlataCash();
	}
	
	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void platesteNota(int suma) {
		modPlata.realizeazaPlata(suma);
	}
}
