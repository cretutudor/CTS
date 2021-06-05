package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.Grupa;
import ro.ase.cts.Student;
import ro.ase.cts.testCategories.TestsGetPromovabilitate;
import ro.ase.cts.testCategories.UrgentTests;

public class GrupaTests {
	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1078);
		assertEquals(1078, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorSubLimitaInferioara() {
		Grupa grupa = new Grupa(999);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorPesteLimitaSuperioara() {
		Grupa grupa = new Grupa(1101);
	}
	
	@Test(timeout=200)
	public void testConstructorPerformanta() {
		Grupa grupa = new Grupa(1078);
	}
	
	@Test
	public void testConstructorExistenceLista() {
		Grupa grupa = new Grupa(1078);
		assertNotNull(grupa.getStudenti());
	}
	
	@Category( {TestsGetPromovabilitate.class, UrgentTests.class} )
	@Test
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1078);
		for(int i = 0; i < 8; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		for(int i = 0; i < 2; i++) {
			Student student = new Student();
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.8, grupa.getPromovabilitate(), 0.001);
	}
	
	@Category(TestsGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1078);
		for(int i = 0; i < 8; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(), 0.001);
	}
	
	@Category(TestsGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateLimitaInferioara() {
		Grupa grupa = new Grupa(1078);
		for(int i = 0; i < 8; i++) {
			Student student = new Student();
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		assertEquals(0, grupa.getPromovabilitate(), 0.001);
	}
	
	@Category(TestsGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateInverse() {
		int nrIntegralisti = 31;
		int nrRestantieri = 2;
		Grupa grupa = new Grupa(1078);
		
		for(int i = 0; i < nrIntegralisti; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		
		for(int i = 0; i < nrRestantieri; i++) {
			Student student = new Student();
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		assertEquals(nrIntegralisti, grupa.getPromovabilitate() * grupa.getStudenti().size(), 0.001);
	}
	
	@Category(TestsGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateError() {
		Grupa grupa = new Grupa(1078);
		assertEquals(0, grupa.getPromovabilitate(), 0.001);
	}
	
	@Category(TestsGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateCardinalityAreRestanta() {
		Grupa grupa = new Grupa(1078);
		Student student = new Student();
		student.adaugaNota(4);
		grupa.adaugaStudent(student);
		assertEquals(0, grupa.getPromovabilitate(), 0.001);
	}
	
	@Category(TestsGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateCardinalityNuAreRestanta() {
		Grupa grupa = new Grupa(1078);
		Student student = new Student();
		student.adaugaNota(10);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(), 0.001);
	}
}
