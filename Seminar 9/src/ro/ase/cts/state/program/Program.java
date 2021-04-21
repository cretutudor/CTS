package ro.ase.cts.state.program;

import ro.ase.cts.state.Masa;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(5);
		
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.rezervaMasa();
		masa.ridicaRezervareMasa();
		masa.elibereazaMasa();
	}

}
