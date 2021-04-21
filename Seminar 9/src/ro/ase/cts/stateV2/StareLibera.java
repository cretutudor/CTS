package ro.ase.cts.stateV2;

public class StareLibera implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if (!(masa.getStare() instanceof StareLibera)) {
			masa.setStare(this);
			System.out.println("Masa " + masa.getCod() + " a fost eliberata");
		}
		else {
			System.out.println("Masa " + masa.getCod() + " nu poate fi eliberata!");
		}
	}
}