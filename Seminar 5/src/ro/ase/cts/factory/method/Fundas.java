package ro.ase.cts.factory.method;

public class Fundas extends Jucator {
	
	public Fundas(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fundas []").append(super.toString());
		return builder.toString();
	}
}
