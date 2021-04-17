package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.Client;
import ro.ase.cts.strategy.PlataCard;

public class Program {

	public static void main(String[] args) {
		Client client = new Client("Mihai");
		client.platesteNota(200);
		client.setModPlata(new PlataCard());
		client.platesteNota(20);
	}
}
