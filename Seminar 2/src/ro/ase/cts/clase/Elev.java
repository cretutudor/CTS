package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int sumaFinantata = 5;
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Elev: ");
		builder.append(super.toString());
		builder.append(", clasa=");
		builder.append(clasa);
		builder.append(", tutore=");
		builder.append(tutore);		
		builder.append("]");
		return builder.toString();
	}

	public void afiseazaSumaFinantata() {
		System.out.println(super.compunereStringAplicant(this.sumaFinantata, "Elevul"));
	}
}
