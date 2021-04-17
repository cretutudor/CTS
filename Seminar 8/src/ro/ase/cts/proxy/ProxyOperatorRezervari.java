package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements IOperatorRezervari{

	private OperatorRezervari operatorRezervari;
	private int nrMinimPersoane;
	
	public ProxyOperatorRezervari(OperatorRezervari operatorRezervari, int nrMinimPersoane) {
		this.operatorRezervari = operatorRezervari;
		this.nrMinimPersoane = nrMinimPersoane;
	}
	
	@Override
	public void realizeazaRezervare(String numeClient, int nrPersoane) {
		if (nrPersoane >= this.nrMinimPersoane) {
			this.operatorRezervari.realizeazaRezervare(numeClient, nrPersoane);
		}
		else {
			System.out.println("Nu este nevoie de rezervare pentru " + nrPersoane);
		}
	}
}
