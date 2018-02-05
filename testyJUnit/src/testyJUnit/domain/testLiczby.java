package testyJUnit.domain;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

public class testLiczby {
	static Liczby L;
	
	@BeforeClass
	public static void beforeClass()
	{
		 L = new Liczby();
	}
	
	@Before
	public void before()
	{
		L.a = 0;
		L.b = 0;
	}
	
	@After
	public void after()
	{
		L.a = 0;
		L.b = 0;
	}
	
	@AfterClass
	public static void afterClass()
	{
		L.a = 0;
		L.b = 0;
	}
	
	@Test
	public void testCzyAWieksze()
	{
		assertTrue(L.czyAWieksze(2, 1));
	}
	
	@Test
	public void testCzyAWieksze2()
	{
		assertFalse(L.czyAWieksze(1,2));
	}
	
	@Test
	public void testDodawanie()
	{
		assertEquals(8,L.dodawanie(3,5));
	}
	
	@Test
	public void testDajNapis()
	{
		assertNull(L.dajNapis());
	}
	
	@Test
	public void testUstawNapis()
	{
		assertNotNull(L.ustawNapis("cos"));
	}
	
	

}
