package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.DecoratorContactless;
import ro.ase.cts.decorator.DecoratorContactlessTelefon;
import ro.ase.cts.decorator.DecoratorAbstract;

public class Program {

	public static void main(String[] args) {
		Card card = new Card("Ion", 5000);
		card.realizeazaPlataNormala(200);
		card.realizeazaPlataOnline(300);
		System.out.println(card.getSold());
		
		DecoratorAbstract decoratorContactless = new DecoratorContactless(card);
		decoratorContactless.realizeazaPlataNormala(200);
		decoratorContactless.realizeazaPlataOnline(300);
		decoratorContactless.platesteContactless(250);
		
		DecoratorContactlessTelefon decoratorContactlessTelefon = new DecoratorContactlessTelefon(card);
		decoratorContactlessTelefon.platesteContactless(100);
		
		System.out.println(card.getSold());
	}
}
