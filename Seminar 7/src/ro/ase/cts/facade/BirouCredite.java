package ro.ase.cts.facade;

public class BirouCredite {
	public boolean areCredit(Persoana persoana) {
		return Integer.parseInt("" + persoana.getCnp().charAt(11)) % 2 == 0;
	}
}
