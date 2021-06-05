package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.Grupa;
import ro.ase.cts.mocks.StudentDummy;
import ro.ase.cts.mocks.StudentFake;

public class GrupaMockTests {

	@Test
	public void testAdaugaStudent() {
		StudentDummy student = new StudentDummy();
		Grupa grupa = new Grupa(1100);
		
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getStudenti().size());
	}
	
	@Test
	public void testGetPromovabilitate() {
		StudentDummy student = new StudentDummy();
		Grupa grupa = new Grupa(1100);
		
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.001);
	}
	
	@Test
	public void testGrupaWithFakeRight() {
		Grupa grupa = new Grupa(1078);
		
		for (int i = 0; i < 7; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(false);
			grupa.adaugaStudent(student);
		}
		
		for (int i = 0; i < 3; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.7, grupa.getPromovabilitate(), 0.001);
	}
}
