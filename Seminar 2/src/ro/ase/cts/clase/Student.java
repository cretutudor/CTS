package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static int sumaFinantata = 20;
	
	public Student() {
		super();		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	
	public String getFacultate() {
		return facultate;
	}
	
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	
	public int getAn_studii() {
		return an_studii;
	}
	
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Student: ");
		builder.append(super.toString());
		builder.append(", facultate=");
		builder.append(facultate);
		builder.append(", an_studii=");
		builder.append(an_studii);
		builder.append("]");
		return builder.toString();
	}

	public void afiseazaSumaFinantata() {
		System.out.println(super.compunereStringAplicant(this.sumaFinantata, "Studentul"));
	}
}
