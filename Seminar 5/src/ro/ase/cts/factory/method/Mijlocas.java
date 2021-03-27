package ro.ase.cts.factory.method;

public class Mijlocas extends Jucator{
	public Mijlocas(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mijlocas []").append(super.toString());
		return builder.toString();
	}
}
