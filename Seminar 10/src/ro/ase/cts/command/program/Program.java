package ro.ase.cts.command.program;

import ro.ase.cts.command.ComandaConstituire;
import ro.ase.cts.command.ComandaDepunere;
import ro.ase.cts.command.ComandaRetragere;
import ro.ase.cts.command.ContBancar;
import ro.ase.cts.command.ManagerComenzi;

public class Program {

	public static void main(String[] args) {
		ContBancar contBancar = new ContBancar("RO215UIHSI214", 0);
		ManagerComenzi managerComenzi = new ManagerComenzi();
		
		managerComenzi.invoca(new ComandaConstituire(contBancar, 1000));
		managerComenzi.invoca(new ComandaDepunere(contBancar, 500));
		managerComenzi.executaComanda();
		
		managerComenzi.invoca(new ComandaRetragere(contBancar, 900));
		managerComenzi.invoca(new ComandaRetragere(contBancar, 700));
		managerComenzi.executaComanda();
	}

}
