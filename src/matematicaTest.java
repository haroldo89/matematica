import static org.junit.Assert.*;

import org.junit.Test;


public class matematicaTest {

	@Test
	public void testMin() {
		matematica objMate= new matematica();
		int expected = 6;
	    int actual= objMate.min(6,10);
	    int delta=0;
	
		assertEquals(expected, actual, delta);
	}

}
