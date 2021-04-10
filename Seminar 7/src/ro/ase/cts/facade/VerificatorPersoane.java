package ro.ase.cts.facade;

public class VerificatorPersoane {
	public static boolean verifica(Persoana persoana) {
		if (persoana.getVarsta() >= 18) {
			if (!Politie.esteUrmarit(persoana)) {
				BirouCredite birouCredite = new BirouCredite();
				if (!birouCredite.areCredit(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
}
