package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {
	protected String file;

	public ReaderAplicanti(String file) {
		this.file = file;
	}
	
	public abstract List<Aplicant> citesteAplicanti() throws FileNotFoundException;

	public void citesteAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = (input.next()).toString();
		int varsta = Integer.valueOf(input.nextInt());
		int punctaj = Integer.valueOf(input.nextInt());
		int nrProiecte = Integer.valueOf(input.nextInt());
		String[] proiecte = new String[5];
		for (int i = 0; i < nrProiecte; i++) {
			proiecte[i] = input.next();
		}
		
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setProiecte(nrProiecte, proiecte);
	}
}
