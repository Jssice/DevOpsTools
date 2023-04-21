package com.dveops;

public class demo01Test {

	@Test
	public void testSum() {
//		fail("Not yet implemented");
		assertEquals("125", new demo01().sum("5", 2,4,6));
	}
	@Test
	public void testSum02() {
		assertEquals("127", new demo01().sum("7",2,4,6));
	}
	@Test
	public void testSum03() {
		assertEquals("135", new demo01().sum("5", 2,4,7));
	}
	@Test
	public void testSum04() {
		assertEquals("125", new demo01().sum("7",2,4,6));
	}
	@Test
	public void testSum05() {
		assertEquals("135", new demo01().sum("5",2,4,6));
	}

}
