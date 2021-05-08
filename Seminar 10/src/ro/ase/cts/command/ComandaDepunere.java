package ro.ase.cts.command;

public class ComandaDepunere implements IComanda{
	private ContBancar contBancar;
	private float sumaDepusa;
	
	public ComandaDepunere(ContBancar contBancar, float sumaDepusa) {
		super();
		this.contBancar = contBancar;
		this.sumaDepusa = sumaDepusa;
	}

	@Override
	public void executa() {
		this.contBancar.depunere(this.sumaDepusa);
	}
}
