package ro.ase.cts.stateV2;

public class StareRezervata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if (masa.getStare() instanceof StareLibera) {
			masa.setStare(this);
			System.out.println("Masa " + masa.getCod() + " a fost rezervata");
		}
		else {
			System.out.println("Masa " + masa.getCod() + " nu poate fi rezervata!");
		}
	}

}
