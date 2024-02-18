import org.junit.Assert;
import org.junit.Test;



public class AssertTest {

	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		//serve para trabalhar com inteiro, short, long etc, porem se comporta diferente com float e double
		Assert.assertEquals(2, 2);
		Assert.assertEquals(0.51, 1.51, 1); //margem de erro 
	}
}
