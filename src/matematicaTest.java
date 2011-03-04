import static org.junit.Assert.*;

import org.junit.Test;


public class matematicaTest {

	@Test
	public void testMin() {
		//fail("Not yet implemented");
		matematica objMate= new matematica();
		//System.out.println(objMate.min(6,10));
	    int expected = 6;
	    int actual= objMate.min(6,10);
	    int delta=0;
	
		assertEquals(expected, actual, delta);
	}

}
