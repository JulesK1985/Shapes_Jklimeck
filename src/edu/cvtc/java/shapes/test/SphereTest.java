package edu.cvtc.java.shapes.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

import edu.cvtc.java.shapes.Sphere;

public class SphereTest {
	
	// New sphere objects to test:
	Sphere sphere1 = new Sphere(2.0f);
	Sphere sphere2 = new Sphere(4.0f);
	Sphere sphere3 = new Sphere(10.0f);
	
	// Surface Area tests:
	@Test
	void testSurfaceArea1() {
		assertEquals(37.68f, sphere1.surfaceArea(), 0.1);
	}
	
	@Test
	void testSurfaceArea2() {
		assertEquals(150.72f, sphere2.surfaceArea(), 0.1);
	}
	
	@Test
	void testSurfaceArea3() {
		assertEquals(942.0f, sphere3.surfaceArea(), 0.1);
	}
	
	// Volume tests:
	@Test
	void testVolume1() {
		assertEquals(33.48f, sphere1.volume(), 0.1);
	}
	
	@Test
	void testVolume2() {
		assertEquals(267.88f, sphere2.volume(), 0.1);
	}
	
	@Test
	void testVolume3() {
		assertEquals(4185.62f, sphere3.volume(), 0.1);
	}
	
	// Getter test
	@Test
	void testGetRadius() {
		assertEquals(10.0f, sphere3.getRadius(), 0.0);
	}

	// Constructor tests:
	@Test
	void testSphere() {
		assertTrue(sphere1.getRadius() > 0);
		assertTrue(sphere2.getRadius() > 0);
		assertTrue(sphere3.getRadius() > 0);
		assertNotNull(sphere1);
		assertNotNull(sphere2);
		assertNotNull(sphere3);
		
	}

}

