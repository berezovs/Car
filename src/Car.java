
public class Car {
	private String color;
	private static int CarCount = 0;
	private int mph = 0;
	private Transmission transmissionType;

	Car() {
		this("grey", Transmission.AUTOMATIC);
	}

	Car(String color, Transmission t) {
		this.color = color;
		this.transmissionType = t;
		++Car.CarCount;
	}

	public String getColor() {
		return this.color;
	}

	public static int getCarCount() {
		return Car.CarCount;
	}

	public int getMPH() {
		return this.mph;
	}

	public void accelerate(int newSpeed) {
		this.mph = newSpeed;
	}

	public Transmission getTransmissionType() {
		return this.transmissionType;
	}
}
