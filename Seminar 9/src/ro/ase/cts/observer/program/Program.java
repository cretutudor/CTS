package ro.ase.cts.observer.program;

import ro.ase.cts.observer.Client;
import ro.ase.cts.observer.Restaurant;

public class Program {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant("Restaurant", "Stefan cel Mare 23");
		Client client1 = new Client("Andrei");
		Client client2 = new Client("Ioana");
		Client client3 = new Client("Maria");
		
		restaurant.adaugaObserver(client1);
		restaurant.adaugaObserver(client2);
		
		restaurant.realizareOfertaPret();
		
		restaurant.stergeObserver(client2);
		restaurant.adaugaObserver(client3);
		
		restaurant.introducereMeniu();
	}

}
