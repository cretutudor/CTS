package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ReaderElevi extends ReaderAplicants{	
	public ReaderElevi(String file) {
		super(file);
	}
	
	@Override
	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.file));
		input.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();
		
		while (input.hasNext()) {
			Elev elev = new Elev();
			super.citesteAplicant(input, elev);
			int clasa = input.nextInt();
			String tutore = input.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		input.close();
		return elevi;
	}
}
