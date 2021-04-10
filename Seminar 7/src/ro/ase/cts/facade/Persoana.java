package ro.ase.cts.facade;

public class Persoana {
	private String nume;
	private String cnp;
	
	public Persoana(String nume, String cnp) {
		super();
		this.nume = nume;
		this.cnp = cnp;
	}

	public String getNume() {
		return nume;
	}

	public String getCnp() {
		return cnp;
	}
	
	public int getVarsta() {
		return 2021 - (1900 + Integer.parseInt("" + cnp.charAt(1) + cnp.charAt(2)));
	}
}
