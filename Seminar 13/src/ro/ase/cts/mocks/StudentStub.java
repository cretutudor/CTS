package ro.ase.cts.mocks;

import java.util.List;

import ro.ase.cts.IStudent;

public class StudentStub implements IStudent {

	@Override
	public String getNume() {
		return "Student";
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		return 5;
	}

	@Override
	public int getNota(int index) {
		return 5;
	}

	@Override
	public boolean areRestante() {
		return false;
	}

}
