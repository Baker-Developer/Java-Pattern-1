package net.oracle;

public class Vehicle {

	private int top_speed;
	private int miles_per_gallon;
	private String vehicle_name;
	public Electric theElectric;

	public int getTop_speed() {
		return top_speed;
	}

	public void setTop_speed(int top_speed) {

		this.top_speed = top_speed;
	}

	public int getMiles_per_gallon() {
		return miles_per_gallon;
	}

	public void setMiles_per_gallon(int miles_per_gallon) {

		this.miles_per_gallon = miles_per_gallon;
	}

	public String getVehicle_name() {
		return vehicle_name;
	}

	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}

	public String tryToCharge() {
		return theElectric.chargeSpeed();
	}

	public void setChargeAbility(Electric newElectricType) {
		theElectric = newElectricType;
	}
}
