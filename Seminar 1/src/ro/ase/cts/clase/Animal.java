package ro.ase.cts.clase;

import ro.ase.cts.interfete.Walk;

public abstract class Animal implements Walk{
	private String nume;
	
	public Animal(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
}
