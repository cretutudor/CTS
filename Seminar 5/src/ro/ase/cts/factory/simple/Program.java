package ro.ase.cts.factory.simple;

public class Program {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Jucator portar = factory.getJucator(TipJucator.Portar, "De Gea");
		Jucator fundas = factory.getJucator(TipJucator.Fundas, "Van Dijk");
		System.out.println(portar);
		System.out.println(fundas);
	}

}
