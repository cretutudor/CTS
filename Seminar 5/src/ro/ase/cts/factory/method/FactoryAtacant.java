package ro.ase.cts.factory.method;

public class FactoryAtacant implements Factory {
	
	@Override
	public Jucator creeazaJucator(String nume) {
		// TODO Auto-generated method stub
		return new Atacant(nume);
	}
}
