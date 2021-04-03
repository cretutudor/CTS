package ro.ase.cts.adapter.clase;

public class AdapterBilet extends Bilet implements BiletOnline{

	public AdapterBilet(int pret) {
		super(pret);
	}

	@Override
	public void vindeBiletOnline() {
		super.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		super.rezerva();
	}

}
