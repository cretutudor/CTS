package ro.ase.cts.stateV2;

public class StareOcupata implements Stare {
	
	@Override
	public void modificaStare(Masa masa) {
		if (!(masa.getStare() instanceof StareOcupata)) {
			masa.setStare(this);
			System.out.println("Masa " + masa.getCod() + " a fost ocupata");
		}
		else {
			System.out.println("Masa " + masa.getCod() + " nu poate fi ocupata!");
		}
	}
}