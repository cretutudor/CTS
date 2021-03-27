package ro.ase.cts.prototype;

public class Client implements ICopiere{
	private String nume;
	private int varsta;
	
	private Client() {
		super();
	}

	public Client(String nume, int varsta) {
		super();
		// se fac validari
		this.nume = nume;
		this.varsta = varsta;
	}

	@Override
	public ICopiere copiaza() {
		Client client = new Client();
		client.nume =  this.nume;
		client.varsta = this.varsta;
		return client;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
}
