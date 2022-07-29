package package2;

public class Car {
	
	private int year;
	private String color;
	private String make;
	
	
	public void Car() {
		year = 0;
		color = "";
		make = "";
	}
	
	public void Car(int yr, String make) {
		this.year = yr;
		this.make = make;
	}
	
	public void Car(int yr, String make, String color) {
		this.year = yr;
		this.make = make;
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public boolean isCarRed(String color) {
		if (color.equals("red")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String allInfo() {
		return this.make +
				" " + this.year + " " + this.color;
	}

}
