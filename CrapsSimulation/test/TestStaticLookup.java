import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.introcs.StdOut;

public class TestStaticLookup
{

	@Test
	public void test_static_methods_dont_override()
	{
		Die die = new CrookedDie1();
		
		assertEquals("Die.testStatic()", die.testStatic());
		
		
	}
	
	@Test
	public void test_downcasting_doesnt_change_static_lookup() 
	{
		Die die = new CrookedDie1();
		
		assertEquals("CrookedDie1.testStatic()", ((CrookedDie1)die).testStatic());
		
		
	}

}
