package ro.ase.cts.singleton;

import ro.ase.cts.singleton.lazy.ReceptieHotel;

public class Program {

	public static void main(String[] args) {
		ReceptieHotel receptie1 = ReceptieHotel.getInstanta("Belvedere", 1, "Popescu");
		ReceptieHotel receptie2 = ReceptieHotel.getInstanta("Decebal", 0, "Ion");
		receptie1.setEtaj(2);
		receptie2.setNumeReceptioner("Ionescu Mircea");
		System.out.println(receptie1);
		System.out.println(receptie2);
	}

}
