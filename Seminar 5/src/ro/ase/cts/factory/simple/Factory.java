package ro.ase.cts.factory.simple;

public class Factory {
	public Jucator getJucator(TipJucator tipJucator, String nume) {
		switch(tipJucator) {
			case Portar: {
				return new Portar(nume);
			}
			case Fundas: {
				return new Fundas(nume);
			}
			case Atacant: {
				return new Atacant(nume);
			}
			default: {
				throw new IllegalArgumentException();
			}
		}
	}
}
