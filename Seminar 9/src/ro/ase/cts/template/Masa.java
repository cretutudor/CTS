package ro.ase.cts.template;

public class Masa extends TemplateOcupareMasa {

	public Masa(int cod) {
		super(cod);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void curataMasa() {
		System.out.println("Masa " + this.cod + " a fost curatata");
	}

	@Override
	public void asazaServetele() {
		System.out.println("Masa " + this.cod + " are servetele");
	}

	@Override
	public void asazaTacamuri() {
		System.out.println("Masa " + this.cod + " are tacamuri");
	}

	@Override
	public void invitaPersoane() {
		System.out.println("La masa " + this.cod + " au fost invitate persoanele");
	}
	
}
