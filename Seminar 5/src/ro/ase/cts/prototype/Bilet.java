package ro.ase.cts.prototype;

public class Bilet implements ICopiere{
	private int cod;
	private String EchipaA;
	private String EchipaB;
	private String ora;
	
	private Bilet() {
		
	}
	
	public Bilet(int cod, String echipaA, String echipaB, String ora) {
		super();
		this.cod = cod;
		EchipaA = echipaA;
		EchipaB = echipaB;
		this.ora = ora;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	
	@Override
	public ICopiere copiaza() {
		Bilet bilet = new Bilet();
		
		bilet.cod = this.cod;
		bilet.EchipaA = this.EchipaA;
		bilet.EchipaB = this.EchipaB;
		bilet.ora = this.ora;
		
		return bilet;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [cod=");
		builder.append(cod);
		builder.append(", EchipaA=");
		builder.append(EchipaA);
		builder.append(", EchipaB=");
		builder.append(EchipaB);
		builder.append(", ora=");
		builder.append(ora);
		builder.append("]");
		return builder.toString();
	}
}
