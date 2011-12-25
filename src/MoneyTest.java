import static org.junit.Assert.*;
import org.junit.Test;

public class MoneyTest {
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.france(1).currency());
	}
}
