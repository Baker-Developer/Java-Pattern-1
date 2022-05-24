package net.oracle;

public class Tundra extends AbstractClass {

	private String name;
	private int mpg;
	private int topSpeed;

	@Override
	public int getTop_speed() {
		// TODO Auto-generated method stub
		return topSpeed;
	}

	@Override
	public void setTop_speed(int top_speed) {
		// TODO Auto-generated method stub
		topSpeed = top_speed;
	}

	@Override
	public int getMiles_per_gallon() {
		// TODO Auto-generated method stub
		return mpg;
	}

	@Override
	public void setMiles_per_gallon(int miles_per_gallon) {
		// TODO Auto-generated method stub
		mpg = miles_per_gallon;
	}

	@Override
	public String getVehicle_name() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setVehicle_name(String vehicle_name) {
		name = vehicle_name;

	}

}
