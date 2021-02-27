package ro.ase.cts;

import ro.ase.cts.clase.Zoo;
import ro.ase.cts.clase.Animal;
import ro.ase.cts.clase.Giraffe;
import ro.ase.cts.clase.Zebra;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Animal a1 = new Zebra("zebra1");
		Animal a2 = new Zebra("zebra2");
		Animal a3 = new Giraffe("girafa1");
		Animal a4 = new Giraffe("girafa2", 500);
		
		zoo.add(a1);
		zoo.add(a2);
		zoo.add(a3);
		zoo.add(a4);
		
		zoo.feedAnimals();
	}

}
