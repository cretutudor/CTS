package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);
		
		assertEquals(nume, student.getNume());
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();
		assertNotNull("Numele nu este initializat", student.getNume());
		assertNotNull("Lista de note nu este initializata", student.getNote());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		student.adaugaNota(10);
		assertEquals(10, student.getNota(0));
	}
	
	// regula 0, 1, n pt dimensiunea listei
	@Test
	public void testDimensiuneListaNote() {
		Student student = new Student();
		student.adaugaNota(10);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();

		assertEquals(0, student.calculeazaMedie(), 0.001);
		student.adaugaNota(10);
		assertEquals(student.getNota(0), student.calculeazaMedie(), 0.001);
		student.adaugaNota(8);
		assertEquals(((student.getNota(0) + student.getNota(1)) / 2), student.calculeazaMedie(), 0.001);
	}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		student.adaugaNota(4);
		student.adaugaNota(10);
		
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		student.adaugaNota(6);
		student.adaugaNota(10);
		
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testSetNume() {
		String nume = "Gigel";
		Student student = new Student(nume);
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaAruncaExceptie() {
		Student student = new Student();
		student.getNota(0);
	}
	
	@Test
	public void testGetNotaAruncaExceptieJUnit3() {
		Student student = new Student();
		try {
			student.getNota(-1);
			fail("Metoda nu arunca exceptia");
		}
		catch(IndexOutOfBoundsException exception) {
		
		}
		catch(Exception ex) {
			fail("Metoda arunca alta exceptie");
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotaNegativa() {
		Student student = new Student();
		student.adaugaNota(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotaMare() {
		Student student = new Student();
		student.adaugaNota(9999);
	}
}
