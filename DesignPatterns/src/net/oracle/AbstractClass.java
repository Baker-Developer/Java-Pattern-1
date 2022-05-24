package net.oracle;

public abstract class AbstractClass {

	protected int top_speed;
	protected int miles_per_gallon;
	protected String vehicle_name;
	

	public abstract int getTop_speed();

	public abstract void setTop_speed(int top_speed);

	public abstract int getMiles_per_gallon();

	public abstract void setMiles_per_gallon(int miles_per_gallon);

	public abstract String getVehicle_name();

	public abstract void setVehicle_name(String vehicle_name);

	

}
