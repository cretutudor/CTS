package ro.ase.cts.clase;

public class Zookeeper {
	private String name;

	public Zookeeper(String name) {
		super();
		this.name = name;
	}
	
	public void feed(Animal a) {
		System.out.println("Ingrijitorul " + this.name + " a hranit animalul " + a.getNume());;
	}
}
