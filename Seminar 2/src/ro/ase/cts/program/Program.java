package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.readers.ReaderAngajati;
import ro.ase.cts.clase.readers.ReaderAplicants;

public class Program {

	public static List<Aplicant> readAplicants(ReaderAplicants readerAplicants) throws FileNotFoundException {
		List<Aplicant> listaAplicanti;
		listaAplicanti = readerAplicants.readAplicants();
		return listaAplicanti;
	}

	public static void afiseazaAplicant(List<Aplicant> listaAplicanti) {
		for (Aplicant aplicant : listaAplicanti) {
			System.out.println(aplicant.toString());
			aplicant.afiseazaSumaFinantata();
			aplicant.afiseazaStatutPeProiect(new Proiect(81));
		}
	}
	
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = readAplicants(new ReaderAngajati("angajati.txt"));
			afiseazaAplicant(listaAplicanti);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
