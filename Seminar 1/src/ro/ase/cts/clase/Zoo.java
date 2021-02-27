package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> animals;
	
	public Zoo() {
		this.zookeeper = new Zookeeper("Anonim");
		this.animals = new ArrayList<Animal>();
	}
	
	public Zoo(Zookeeper zookeeper, List<Animal> animals) {
		super();
		this.zookeeper = zookeeper;
		this.animals = animals;
	}
	
	public Zookeeper getZookeeper() {
		return zookeeper;
	}
	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	public void add(Animal animal) {
		this.animals.add(animal);
	}
	
	public void feedAnimals() {
		for (Animal animal : this.animals)	{ 
			this.zookeeper.feed(animal);
        } 
	}
	
	public void movingAnimals() {
		for (Animal animal : this.animals)	{ 
			animal.walks();
        } 
	}
}
