package ro.ase.cts.clase;

public class Giraffe extends Animal{
	private int inaltime;

	public Giraffe(String nume) {
		super(nume);
		this.inaltime = 400;
	}
	
	public Giraffe(String nume, int inaltime) {
		super(nume);
		this.inaltime = inaltime;
	}

	public int getInaltime() {
		return inaltime;
	}

	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}

}
