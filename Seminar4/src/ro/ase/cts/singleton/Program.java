package ro.ase.cts.singleton;

import ro.ase.cts.singleton.lazy.ReceptieHotel;
import ro.ase.cts.singleton.lazy.Medicament;

public class Program {

	public static void main(String[] args) {
		ReceptieHotel receptie1 = ReceptieHotel.getInstanta("Belvedere", 1, "Popescu");
		ReceptieHotel receptie2 = ReceptieHotel.getInstanta("Decebal", 0, "Ion");
		receptie1.setEtaj(2);
		receptie2.setNumeReceptioner("Ionescu Mircea");
		System.out.println(receptie1);
		System.out.println(receptie2);
		
		Medicament medicament1 = Medicament.getInstanta("Augmentin", 15.50, true);
		Medicament medicament2 = Medicament.getInstanta("Paracetamol", 35, false);
		medicament1.setPret(25);
		medicament2.setNume("Nurofen");
		System.out.println(medicament1);
		System.out.println(medicament2);
	}

}
