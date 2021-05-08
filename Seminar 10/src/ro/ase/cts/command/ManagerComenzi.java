package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	private List<IComanda> listaComenzi;
	
	public ManagerComenzi() {
		this.listaComenzi = new ArrayList<>();
	}
	
	public void invoca(IComanda comanda) {
		this.listaComenzi.add(comanda);
	}
	
	public void executaComanda() {
		if (this.listaComenzi.size() > 0) {
			this.listaComenzi.get(0).executa();
			this.listaComenzi.remove(0);	
		}
	}
	
	public void executaToateComenzile() {
		for (IComanda comanda: this.listaComenzi) {
			this.executaComanda();
		}
		this.listaComenzi.clear();
	}
}
