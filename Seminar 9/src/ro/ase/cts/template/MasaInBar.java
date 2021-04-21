package ro.ase.cts.template;

public class MasaInBar extends Masa {

	public MasaInBar(int cod) {
		super(cod);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void asazaTacamuri() {
		System.out.println("Masa " + this.cod + " are tacamuri si pahare");
	}

}
