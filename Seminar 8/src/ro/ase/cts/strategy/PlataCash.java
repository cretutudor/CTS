package ro.ase.cts.strategy;

public class PlataCash implements ModPlata{

	@Override
	public void realizeazaPlata(int suma) {
		System.out.println("S-a realizat plata cash in suma de " + suma);
	}

}