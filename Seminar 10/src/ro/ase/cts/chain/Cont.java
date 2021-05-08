package ro.ase.cts.chain;

public abstract class Cont {
	private Cont contSuccesor;
	private String iban;
	private float sold;
	
	public Cont(String iban, float sold) {
		this.contSuccesor = null;
		this.iban = iban;
		this.sold = sold;
	}

	public Cont getContSuccesor() {
		return contSuccesor;
	}

	public void setContSuccesor(Cont contSuccesor) {
		this.contSuccesor = contSuccesor;
	}
	
	public float getSold() {
		return sold;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}

	public abstract void plateste(float suma);
}
