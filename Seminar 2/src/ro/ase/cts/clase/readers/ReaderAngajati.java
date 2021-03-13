package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class ReaderAngajati extends ReaderAplicants{	
	public ReaderAngajati(String file) {
		super(file);
	}

	@Override
	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.file));
		input.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();
		
		while (input.hasNext()) {
			Angajat angajat = new Angajat();
			super.citesteAplicant(input, angajat);
			int salariu = input.nextInt();
			String ocupatie = input.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			angajati.add(angajat);
		}
		input.close();
		return angajati;
	}
}
