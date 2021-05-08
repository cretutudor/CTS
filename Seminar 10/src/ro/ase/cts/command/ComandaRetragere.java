package ro.ase.cts.command;

public class ComandaRetragere implements IComanda{
	private ContBancar contBancar;
	private float sumaRetrasa;
	
	public ComandaRetragere(ContBancar contBancar, float sumaRetrasa) {
		super();
		this.contBancar = contBancar;
		this.sumaRetrasa = sumaRetrasa;
	}

	@Override
	public void executa() {
		this.contBancar.retragere(this.sumaRetrasa);
	}
}
