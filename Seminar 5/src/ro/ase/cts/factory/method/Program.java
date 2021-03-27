package ro.ase.cts.factory.method;

public class Program {

	public static void afiseazaInformatiiJucator(Factory factory, String nume) {
		Jucator jucator = factory.creeazaJucator(nume);
		System.out.println(jucator);
	}
	
	public static void main(String[] args) {
		afiseazaInformatiiJucator(new FactoryPortar(), "De Gea");
		afiseazaInformatiiJucator(new FactoryFundas(), "Van Dijk");
		afiseazaInformatiiJucator(new FactoryMijlocas(), "Fernandes");
	}
}
