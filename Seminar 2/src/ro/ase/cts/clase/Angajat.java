package ro.ase.cts.clase;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static int sumaFinantata = 10;
	
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] proiecte,int salariu,String ocupatie) {
		super(nume, prenume, varsta, punctaj, nrProiecte, proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	
	public Angajat() {
		super();
	}
	
	public String getOcupatie() {
		return ocupatie;
	}
	
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	
	public int getSalariu() {
		return salariu;
	}
	
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Angajat: ");
		builder.append(super.toString());
		builder.append(", ocupatie=");
		builder.append(ocupatie);
		builder.append(", salariu=");
		builder.append(salariu);
		builder.append("]");
		return builder.toString();
	}

	public void afiseazaSumaFinantata() {
		System.out.println(super.compunereStringAplicant(this.sumaFinantata, "Angajatul"));
	}
}
