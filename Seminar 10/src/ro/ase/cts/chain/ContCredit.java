package ro.ase.cts.chain;

public class ContCredit extends Cont {
	
	public ContCredit(String iban, float sold) {
		super(iban, sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if (super.getSold() >= suma) {
			super.setSold(super.getSold() - suma);
			System.out.println("S-a realizat plata din contul de credit in valoare de " + suma);
		}
		else {
			if (super.getContSuccesor() != null) {
				super.getContSuccesor().plateste(suma);
			}
			else {
				System.out.println("Plata refuzata");
			}
		}
	}
}