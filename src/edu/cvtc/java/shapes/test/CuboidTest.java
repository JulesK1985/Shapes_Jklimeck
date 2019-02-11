package edu.cvtc.java.shapes.test;

import static org.junit.Assert.*;
import org.junit.Test;


import edu.cvtc.java.shapes.Cuboid;

public class CuboidTest {
	// New cube objects to test:
	Cuboid cube1 = new Cuboid(1.0f, 1.0f, 1.0f);
	Cuboid cube2 = new Cuboid(2.0f, 2.0f, 2.0f);
	Cuboid cube3 = new Cuboid(3.0f, 3.0f, 3.0f);
	
	// Surface Area tests:
	@Test
	void testSurfaceArea1() {
		assertEquals(6.0f, cube1.surfaceArea(), 0.0);
	}
	
	@Test
	void testSurfaceArea2() {
		assertEquals(24.0f, cube2.surfaceArea(), 0.0);
	}
	
	@Test
	void testSurfaceArea3() {
		assertEquals(54.0f, cube3.surfaceArea(), 0.0);
	}
	
	// Volume tests:
	@Test
	void testVolume1() {
		assertEquals(1.0f, cube1.volume(), 0.0);
	}
	
	@Test
	void testVolume2() {
		assertEquals(8.0f, cube2.volume(), 0.0);
	}
	
	@Test
	void testVolume3() {
		assertEquals(27.0f, cube3.volume(), 0.0);
	}
	
	// Getter tests:
	@Test
	void testGetWidth() {
		assertEquals(1.0f, cube1.getWidth(), 0.0);
	}

	@Test
	void testGetHeight() {
		assertEquals(2.0f, cube2.getHeight(), 0.0);
	}

	@Test
	void testGetDepth() {
		assertEquals(3.0f, cube3.getDepth(), 0.0);
	}
	
	// Constructor tests:
	@Test
	void testCuboid() {
		assertTrue(cube1.getWidth() > 0);
		assertTrue(cube2.getWidth() > 0);
		assertTrue(cube3.getWidth() > 0);
		assertTrue(cube1.getHeight() > 0);
		assertTrue(cube2.getHeight() > 0);
		assertTrue(cube3.getHeight() > 0);
		assertTrue(cube1.getDepth() > 0);
		assertTrue(cube2.getDepth() > 0);
		assertTrue(cube3.getDepth() > 0);
		assertNotNull(cube1);
		assertNotNull(cube2);
		assertNotNull(cube3);
	}
}
