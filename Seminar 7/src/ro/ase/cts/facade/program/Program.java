package ro.ase.cts.facade.program;

import ro.ase.cts.facade.BirouCredite;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;
import ro.ase.cts.facade.VerificatorPersoane;

public class Program {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("Mihai", "1990714875653");
		if (persoana.getVarsta() >= 18) {
			if (!Politie.esteUrmarit(persoana)) {
				BirouCredite birouCredite = new BirouCredite();
				if (!birouCredite.areCredit(persoana)) {
					System.out.println("Cont creat pentru " + persoana.getNume());
				}
			}
		}
		
		Persoana persoana2 = new Persoana("Andrei", "1990714845623");
		if (VerificatorPersoane.verifica(persoana2)) {
			System.out.println("Cont creat pentru " + persoana2.getNume());
		}
		else {
			System.out.println("Nu se poate crea contul pentru " + persoana2.getNume());
		}
	}
}