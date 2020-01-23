
public class Car {
	private String color;
	private static int CarCount = 0;

	Car() {
		this("grey");
	}

	Car(String color) {
		this.color = color;
		++Car.CarCount;
	}

	public String getColor() {
		return this.color;
	}

	public static int getCarCount() {
		return Car.CarCount;
	}
}
