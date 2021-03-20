package ro.ase.cts.singleton.lazy;

import ro.ase.cts.singleton.lazy.ReceptieHotel;

public class ReceptieHotel {
	private String numeHotel;
	private int etaj;
	private String numeReceptioner;
	private static ReceptieHotel instanta = null;
	
	// private!!!!!
	private ReceptieHotel(String numeHotel, int etaj, String numeReceptioner) {
		super();
		this.numeHotel = numeHotel;
		this.etaj = etaj;
		this.numeReceptioner = numeReceptioner;
	}

	public void setNumeHotel(String numeHotel) {
		this.numeHotel = numeHotel;
	}

	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}

	public void setNumeReceptioner(String numeReceptioner) {
		this.numeReceptioner = numeReceptioner;
	}

	public static synchronized ReceptieHotel getInstanta(String numeHotel, int etaj, String numeReceptioner) {
		if (instanta == null) {
			instanta = new ReceptieHotel(numeHotel, etaj, numeReceptioner);
		}
		return instanta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReceptieHotel [numeHotel=");
		builder.append(numeHotel);
		builder.append(", etaj=");
		builder.append(etaj);
		builder.append(", numeReceptioner=");
		builder.append(numeReceptioner);
		builder.append("]");
		return builder.toString();
	}
	
	
}

