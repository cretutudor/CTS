package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicants {
	protected String file;

	public ReaderAplicants(String file) {
		this.file = file;
	}
	
	public abstract List<Aplicant> readAplicants() throws FileNotFoundException;
}
