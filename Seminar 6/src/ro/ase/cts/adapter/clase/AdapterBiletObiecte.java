package ro.ase.cts.adapter.clase;

public class AdapterBiletObiecte implements BiletOnline{

	private Bilet bilet;
	
	public AdapterBiletObiecte(Bilet bilet) {
		this.bilet = bilet;
	}
	
	@Override
	public void vindeBiletOnline() {
		this.bilet.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		this.bilet.rezerva();
	}
}
