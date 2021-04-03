package ro.ase.cts.builder.clase;

public class BuilderRezervareV2 implements AbstractBuilder {

	private int cod;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	public BuilderRezervareV2() {
		this.cod = 0;
		this.areMancareInclusa = false;
		this.areBauturaInclusa = false;
		this.areScaunErgonomic = false;
		this.areMuzicaAmbientala = false;
		this.genMuzica = "";
	}
	
	@Override
	public Rezervare build() {
		return new Rezervare(this.cod, this.areMancareInclusa, this.areBauturaInclusa, this.areScaunErgonomic, this.areMuzicaAmbientala, this.genMuzica);
		
	}
	
	public BuilderRezervareV2 setCod(int cod) {
		this.cod = cod;
		return this;
	}

	public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}

	public BuilderRezervareV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
		return this;
	}

	public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public BuilderRezervareV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}

	public BuilderRezervareV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}
}
