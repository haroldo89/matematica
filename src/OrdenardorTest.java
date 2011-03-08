import static org.junit.Assert.*;

import org.junit.Test;


public class OrdenardorTest {

	@Test
	public void testOrdenar() {
		Ordenardor a;
		a = new Ordenardor();
		int resp[]= a.ordenar(new int[]{4,5,3,8});
		System.out.println(resp[0]+ " "+resp[1]+" "+resp[2]+" "+resp[3]);

		int expected[]={3,4,5,8};
		int actual[]=resp;
		assertArrayEquals(expected, actual);
	}
}
