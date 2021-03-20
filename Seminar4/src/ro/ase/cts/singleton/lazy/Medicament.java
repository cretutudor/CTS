package ro.ase.cts.singleton.lazy;

public class Medicament {
	private String nume;
	private double pret;
	private boolean necesitaReteta;
	private static Medicament instanta = null;
	
	private Medicament(String nume, double pret, boolean necesitaReteta) {
		super();
		this.nume = nume;
		this.pret = pret;
		this.necesitaReteta = necesitaReteta;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public void setNecesitaReteta(boolean necesitaReteta) {
		this.necesitaReteta = necesitaReteta;
	}

	public static synchronized Medicament getInstanta(String nume, double pret, boolean necesitaReteta) {
		if (instanta == null) {
			instanta = new Medicament(nume, pret, necesitaReteta);
		}
		return instanta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medicament [nume=");
		builder.append(nume);
		builder.append(", pret=");
		builder.append(pret);
		builder.append(", necesitaReteta=");
		builder.append(necesitaReteta);
		builder.append("]");
		return builder.toString();
	}
}
