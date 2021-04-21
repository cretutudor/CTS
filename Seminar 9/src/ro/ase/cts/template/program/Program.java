package ro.ase.cts.template.program;

import ro.ase.cts.template.Masa;
import ro.ase.cts.template.MasaInBar;
import ro.ase.cts.template.TemplateOcupareMasa;

public class Program {

	public static void main(String[] args) {
		TemplateOcupareMasa masa = new Masa(12);
		masa.ocupaMasa();
		
		TemplateOcupareMasa masaBar = new MasaInBar(23);
		masaBar.ocupaMasa();
	}
}
