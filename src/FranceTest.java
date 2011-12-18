import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class FranceTest {
	@Test
	public void testMultiplication() {
		France five = new France(5);
		assertEquals(new France(10), five.times(2));
		assertEquals(new France(15), five.times(3));
	}
}
