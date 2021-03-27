package ro.ase.cts.factory.method;

public abstract class Jucator {
	private String nume;

	public Jucator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jucator [nume=");
		builder.append(nume);
		builder.append("]");
		return builder.toString();
	}
	
	
}
