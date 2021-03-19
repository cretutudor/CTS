package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.readers.ReaderAngajati;
import ro.ase.cts.clase.readers.ReaderAplicanti;

public class Program {

	public static List<Aplicant> citesteAplicanti(ReaderAplicanti readerAplicanti) throws FileNotFoundException {
		List<Aplicant> listaAplicanti;
		listaAplicanti = readerAplicanti.citesteAplicanti();
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
			listaAplicanti = citesteAplicanti(new ReaderAngajati("angajati.txt"));
			afiseazaAplicant(listaAplicanti);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
