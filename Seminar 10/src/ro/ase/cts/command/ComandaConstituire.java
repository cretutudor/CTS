package ro.ase.cts.command;

public class ComandaConstituire implements IComanda{
	private ContBancar contBancar;
	private float sumaInitiala;
	
	public ComandaConstituire(ContBancar contBancar, float sumaInitiala) {
		super();
		this.contBancar = contBancar;
		this.sumaInitiala = sumaInitiala;
	}

	@Override
	public void executa() {
		this.contBancar.constituire(this.sumaInitiala);
	}

}
