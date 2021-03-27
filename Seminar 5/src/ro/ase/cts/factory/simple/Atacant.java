package ro.ase.cts.factory.simple;

public class Atacant extends Jucator {
	
	public Atacant(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant []").append(super.toString());
		return builder.toString();
	}
}
