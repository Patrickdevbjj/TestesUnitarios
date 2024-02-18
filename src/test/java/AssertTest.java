import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;



public class AssertTest {

	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		//serve para trabalhar com inteiro, short, long etc, porem se comporta diferente com float e double
		Assert.assertEquals(2, 2);
		Assert.assertEquals(0.51, 1.51, 1); //margem de erro 
		
		int i = 5;
		Integer i2 = 5;
		Assert.assertEquals(Integer.valueOf(i), i2);	
		Assert.assertEquals(i, i2.intValue());
		
		Assert.assertEquals("bola", "bola");
		Assert.assertTrue("Bola".equalsIgnoreCase("bola"));
		Assert.assertTrue("bola".startsWith("bo"));

		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");
		Usuario u3 = new Usuario(null);
		
		Assert.assertEquals(u1, u2);
		
	}
}
