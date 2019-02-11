package edu.cvtc.java.shapes.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

import edu.cvtc.java.shapes.Cylinder;

public class CylinderTest {
	
	// New cylinder objects to test:
	Cylinder cylinder1 = new Cylinder(1.0f, 4.0f);
	Cylinder cylinder2 = new Cylinder(2.0f, 5.0f);
	Cylinder cylinder3 = new Cylinder(3.0f, 6.0f);
	
	// Surface Area tests:
	@Test
	void testSurfaceArea1() {
		assertEquals(10.28f, cylinder1.surfaceArea(), 0.1);
	}
	
	@Test
	void testSurfaceArea2() {
		assertEquals(30.12f, cylinder2.surfaceArea(), 0.1);
	}

	@Test
	void testSurfaceArea3() {
		assertEquals(62.52f, cylinder3.surfaceArea(), 0.1);
	}

	// Volume tests:
	@Test
	void testVolume1() {
		assertEquals(12.56f, cylinder1.volume(), 0.1);
	}
	
	@Test
	void testVolume2() {
		assertEquals(31.4f, cylinder2.volume(), 0.1);
	}
	
	@Test
	void testVolume3() {
		assertEquals(56.52f, cylinder3.volume(), 0.1);
	}
	
	// Getter tests:
	@Test
	void testGetRadius() {
		assertEquals(1.0f, cylinder1.getRadius(), 0.0);
	}

	@Test
	void testGetHeight() {
		assertEquals(1.0f, cylinder2.getHeight(), 0.0);
	}

	// Constructor Tests:
	@Test
	void testSphere() {
		assertTrue(cylinder1.getRadius() > 0);
		assertTrue(cylinder2.getRadius() > 0);
		assertTrue(cylinder3.getRadius() > 0);
		assertTrue(cylinder1.getHeight() > 0);
		assertTrue(cylinder2.getHeight() > 0);
		assertTrue(cylinder3.getHeight() > 0);
		assertNotNull(cylinder1);
		assertNotNull(cylinder2);
		assertNotNull(cylinder3);
	}

}


