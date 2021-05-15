package ro.ase.cts.memento;

public class MeciJucat {
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	private int numarBileteVandute;
	private int numarSpectatori;
	private int numarJandarmi;
	private int numarStewarzi;
	
	public MeciJucat(String numeEchipaGazda, String numeEchipaOaspeti, int numarBileteVandute, int numarSpectatori,
			int numarJandarmi, int numarStewarzi) {
		super();
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
		this.numarBileteVandute = numarBileteVandute;
		this.numarSpectatori = numarSpectatori;
		this.numarJandarmi = numarJandarmi;
		this.numarStewarzi = numarStewarzi;
	}

	public void setNumeEchipaGazda(String numeEchipaGazda) {
		this.numeEchipaGazda = numeEchipaGazda;
	}

	public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}

	public void setNumarBileteVandute(int numarBileteVandute) {
		this.numarBileteVandute = numarBileteVandute;
	}

	public void setNumarSpectatori(int numarSpectatori) {
		this.numarSpectatori = numarSpectatori;
	}

	public void setNumarJandarmi(int numarJandarmi) {
		this.numarJandarmi = numarJandarmi;
	}

	public void setNumarStewarzi(int numarStewarzi) {
		this.numarStewarzi = numarStewarzi;
	}
	
	public Memento creareMemento() {
		Memento memento = new Memento(this.numeEchipaGazda, this.numeEchipaOaspeti, this.numarSpectatori);
		return memento;
	}
	
	public void setMemento(Memento memento) {
		this.numeEchipaGazda = memento.getNumeEchipaGazda();
		this.numeEchipaOaspeti = memento.getNumeEchipaOaspeti();
		this.numarSpectatori = memento.getNumarSpectatori();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [numeEchipaGazda=");
		builder.append(numeEchipaGazda);
		builder.append(", numeEchipaOaspeti=");
		builder.append(numeEchipaOaspeti);
		builder.append(", numarBileteVandute=");
		builder.append(numarBileteVandute);
		builder.append(", numarSpectatori=");
		builder.append(numarSpectatori);
		builder.append(", numarJandarmi=");
		builder.append(numarJandarmi);
		builder.append(", numarStewarzi=");
		builder.append(numarStewarzi);
		builder.append("]");
		return builder.toString();
	}
}
