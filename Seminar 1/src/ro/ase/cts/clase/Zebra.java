package ro.ase.cts.clase;

public class Zebra extends Animal {

	public Zebra(String nume) {
		super(nume);
		
	}

	@Override
	public void walks() {
		System.out.println("Zebra merge pe 4 picioare");
	}
	
}
