package ro.ase.cts.state;

public class Masa {
	private int cod;
	private Stare stare;
	
	public Masa(int cod) {
		super();
		this.cod = cod;
		this.stare = new StareLibera();
	}

	public Stare getStare() {
		return stare;
	}

	public void setStare(Stare stare) {
		this.stare = stare;
	}
	
	public void rezervaMasa() {
		if (this.stare instanceof StareLibera) {
			this.stare = new StareRezervata();
			System.out.println("S-a realizat rezervarea pentru masa " + this.cod);
		}
		else {
			System.out.println("Masa " + this.cod + " nu poate fi rezervata!");
		}
	}
	
	public void ridicaRezervareMasa() {
		if (this.stare instanceof StareRezervata) {
			this.stare = new StareOcupata();
			System.out.println("S-a ocupat rezervarea pentru masa " + this.cod);
		}
		else {
			System.out.println("Masa " + this.cod + " nu poate fi ocupata!");
		}
	}
	
	public void elibereazaMasa() {
		if (!(this.stare instanceof StareLibera)) {
			this.stare = new StareLibera();
			System.out.println("S-a eliberat masa " + this.cod);
		}
		else {
			System.out.println("Masa " + this.cod + " este deja libera!");
		}
	}
	
	public void ocupaMasa() {
		if (this.stare instanceof StareLibera) {
			this.stare = new StareOcupata();
			System.out.println("S-a ocupat masa " + this.cod + ", fara rezervare");
		}
		else {
			System.out.println("Masa " + this.cod + " nu poate fi ocupata!");
		}
	}
}
