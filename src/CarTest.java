import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {

	@Test
	public void test() {
		Car jalopy = new Car();
		Car corvette = new Car("red");

		assertEquals("grey", jalopy.getColor());
		assertEquals("red", corvette.getColor());
		assertEquals(2, Car.getCarCount());
	}

}
