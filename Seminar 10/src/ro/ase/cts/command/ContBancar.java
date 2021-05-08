package ro.ase.cts.command;

public class ContBancar {
	private String iban;
	private float sold;
	
	public ContBancar(String iban, float sold) {
		super();
		this.iban = iban;
		this.sold = sold;
	}
	
	public void constituire(float sumaInitiala) {
		this.sold = sumaInitiala;
		System.out.println("A fost constituit un cont cu suma " + this.sold);
	}
	
	public void retragere(float sumaRetrasa) {
		if (this.sold >= sumaRetrasa) {
			this.sold -= sumaRetrasa;
			System.out.println("A fost retrasa suma de " + sumaRetrasa);
		}
		else {
			System.out.println("Fonduri insuficiente");
		}
	}
	
	public void depunere(float sumaDepusa) {
		this.sold += sumaDepusa;
		System.out.println("A fost depusa suma de " + sumaDepusa);
	}
}
