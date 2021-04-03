package ro.ase.cts.adapter;

import ro.ase.cts.adapter.clase.AdapterBilet;
import ro.ase.cts.adapter.clase.AdapterBiletObiecte;
import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletOnline;

public class Program {

	public static void rezervaSiVindeBileteLaCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	
	public static void rezervaSiVindeBiletePePlatforma(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	
	public static void main(String[] args) {
		Bilet bilet = new Bilet(20);
		rezervaSiVindeBileteLaCasa(bilet);
		
		AdapterBilet adapterBilet = new AdapterBilet(30);
		rezervaSiVindeBiletePePlatforma(adapterBilet);
		
		BiletOnline biletOnline = new AdapterBiletObiecte(bilet);
		rezervaSiVindeBiletePePlatforma(biletOnline);
	}

}
