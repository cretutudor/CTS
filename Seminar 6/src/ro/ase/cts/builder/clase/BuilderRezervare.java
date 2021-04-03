package ro.ase.cts.builder.clase;

public class BuilderRezervare implements AbstractBuilder {

	private Rezervare rezervare;
	
	public BuilderRezervare() {
		this.rezervare = new Rezervare(0, false, false, false, false, "");
	}
	
	public BuilderRezervare(int cod) {
		this.rezervare = new Rezervare(cod, false, false, false, false, "");
	}
	
	@Override
	public Rezervare build() {
		return this.rezervare;
	}

	public BuilderRezervare setCod(int cod) {
		this.rezervare.setCod(cod);
		return this;
	}

	public BuilderRezervare setAreMancareInclusa(boolean areMancareInclusa) {
		this.rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}

	public BuilderRezervare setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}

	public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}

	public BuilderRezervare setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}

	public BuilderRezervare setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}
}
