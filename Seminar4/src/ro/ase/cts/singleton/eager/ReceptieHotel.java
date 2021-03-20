package ro.ase.cts.singleton.eager;

public class ReceptieHotel {
	private String numeHotel;
	private int etaj;
	private String numeReceptioner;
	private static final ReceptieHotel instanta = new ReceptieHotel("Belvedere", 1, "Popescu Mihai");
	
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

	public static ReceptieHotel getInstanta() {
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
