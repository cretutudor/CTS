package ro.ase.cts.observer;

public interface Observabil {
	void adaugaObserver(Observer observer);
	void stergeObserver(Observer observer);
	void trimiteMesaj(String mesaj);
}
