package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.OperatorRezervari;
import ro.ase.cts.proxy.ProxyOperatorRezervari;

public class Program {

	public static void main(String[] args) {
		OperatorRezervari operatorRezervari = new OperatorRezervari();
		operatorRezervari.realizeazaRezervare("Mihai", 1);
		
		ProxyOperatorRezervari proxyOperatorRezervari = new ProxyOperatorRezervari(operatorRezervari, 4);
		proxyOperatorRezervari.realizeazaRezervare("Andrei", 1);
		proxyOperatorRezervari.realizeazaRezervare("Alex", 4);
	}

}
