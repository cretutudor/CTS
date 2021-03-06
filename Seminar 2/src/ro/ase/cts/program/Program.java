package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.ReaderAngajati;
import ro.ase.cts.clase.readers.ReaderAplicants;

public class Program {

	public static List<Aplicant> readAplicants(ReaderAplicants readerAplicants) throws FileNotFoundException {
		List<Aplicant> listaAplicanti;
		listaAplicanti = readerAplicants.readAplicants();
		return listaAplicanti;
	}
	
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = readAplicants(new ReaderAngajati("angajati.txt"));
			for(Aplicant aplicant : listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
