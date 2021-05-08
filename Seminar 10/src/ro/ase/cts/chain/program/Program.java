package ro.ase.cts.chain.program;

import ro.ase.cts.chain.Cont;
import ro.ase.cts.chain.ContCredit;
import ro.ase.cts.chain.ContCurent;
import ro.ase.cts.chain.ContEconomii;

public class Program {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent("RO12OIN51", 1000);
		Cont contEconomii = new ContEconomii("RO1215IN51", 1500);
		Cont contCredit = new ContCredit("RO1298J15", 2000);
	
		contCurent.setContSuccesor(contCredit);
		contCredit.setContSuccesor(contEconomii);
		
		contCurent.plateste(500);
		contCurent.plateste(500);
		contCurent.plateste(1500);
		contCurent.plateste(500);
		contCurent.plateste(500);
		contCurent.plateste(1500);
		
	
	
	}

}
