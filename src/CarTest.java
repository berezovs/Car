import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {

	@Test
	public void test() {
		Car jalopy = new Car();

		Car corvette = new Car("red", Transmission.MANUAL);

		assertEquals("grey", jalopy.getColor());

		assertEquals("red", corvette.getColor());

		assertEquals(2, Car.getCarCount());

		assertEquals(0, corvette.getMPH());

		corvette.accelerate(34);

		assertEquals(34, corvette.getMPH());

	}

}
