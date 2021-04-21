package ro.ase.cts.stateV2.program;

import ro.ase.cts.stateV2.Masa;
import ro.ase.cts.stateV2.StareLibera;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(10);
		
		masa.ocupaMasa();
		masa.rezervaMasa();
		// masa.setStare(new StareLibera());
		masa.rezervaMasa();
		masa.elibereazaMasa();
	}

}
