package ro.ase.cts.memento.program;

import ro.ase.cts.memento.ManagerMemento;
import ro.ase.cts.memento.MeciJucat;
import ro.ase.cts.memento.Memento;

public class Program {

	public static void main(String[] args) {
		MeciJucat meciJucat1 = new MeciJucat("FCSB", "Dinamo", 250, 145, 200, 100);
		Memento memento = meciJucat1.creareMemento();
		ManagerMemento managerMemento = new ManagerMemento();
		managerMemento.adaugaMemento(memento);
			
		meciJucat1.setNumarSpectatori(7500);
		meciJucat1.setNumarBileteVandute(7500);
		meciJucat1.setNumeEchipaGazda("Barcelona");
		meciJucat1.setNumeEchipaOaspeti("Manchester United");
		
		managerMemento.adaugaMemento(meciJucat1.creareMemento());
		System.out.println(meciJucat1);
		meciJucat1.setMemento(managerMemento.getMemento(0));
		System.out.println(meciJucat1);
		meciJucat1.setMemento(managerMemento.getLastMemento());
		System.out.println(meciJucat1);
	}

}
