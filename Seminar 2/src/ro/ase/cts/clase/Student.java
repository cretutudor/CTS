package ro.ase.cts.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantata = 20;
	
	public Student() {
		super();		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] proiecte, String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, nrProiecte, proiecte);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	
	public String getFacultate() {
		return facultate;
	}
	
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	
	public int getAnStudii() {
		return anStudii;
	}
	
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Student: ");
		builder.append(super.toString());
		builder.append(", facultate=");
		builder.append(facultate);
		builder.append(", anStudii=");
		builder.append(anStudii);
		builder.append("]");
		return builder.toString();
	}

	public void afiseazaSumaFinantata() {
		System.out.println(super.compunereStringAplicant(this.sumaFinantata, "Studentul"));
	}
}
