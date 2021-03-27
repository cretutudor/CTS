package ro.ase.cts.factory.simple;

public class Portar extends Jucator {

	public Portar(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portar []").append(super.toString());
		return builder.toString();
	}
}
