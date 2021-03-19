package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] proiecte;

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] proiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.proiecte = proiecte;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public int getNrProiecte() {
		return nrProiecte;
	}

	public void setProiecte(int nrProiecte, String[] proiecte) {
		this.nrProiecte = nrProiecte;
		this.proiecte = proiecte;
	}

	public String[] getProiecte() {
		return proiecte;
	}

	public abstract void afiseazaSumaFinantata();
	
	public void afiseazaStatutPeProiect(Proiect proiect) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Aplicantul ").append(nume).append(" ").append(prenume);
		stringBuilder.append(punctaj > proiect.getPragAcceptare() ? " a fost acceptat." : " nu a fost acceptat.");
		System.out.println(stringBuilder);
	}

	public String compunereStringAplicant(int sumaFinantata, String tipAplicant) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(tipAplicant).append(" ");
		stringBuilder.append(getNume());
		stringBuilder.append(" ");
		stringBuilder.append(getPrenume());
		stringBuilder.append(" primeste ");
		stringBuilder.append(sumaFinantata);
		stringBuilder.append(" Euro/zi in proiect.");
		return stringBuilder.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", nrProiecte=");
		builder.append(nrProiecte);
		builder.append(", proiecte=");
		builder.append(Arrays.toString(proiecte));
		return builder.toString();
	}

	

}
