package net.oracle;

import net.oracle.Electric.Charge;

public class MainVehicleClass {

	public static void main(String[] args) {
		Car1 one = new Car1();
		Car2 two = new Car2();

		one.setMiles_per_gallon(25);
		two.setMiles_per_gallon(18);
		one.setVehicle_name("Toyota Tacoma");
		two.setVehicle_name("Ford F-150 Lightning");

//		System.out.println("\nNames Of Vehicles Are..   " + "\n----" + one.getVehicle_name() + "\n----"
//				+ two.getVehicle_name());

		changeObjName(one);
		Vehicle c = new Car1();
		Vehicle t = new Car2();

//		System.out.println(c.getTop_speed());
//		System.out.println();
//		System.out.println(t.getTop_speed());

		Vehicle[] vehicles = new Vehicle[4];
		vehicles[0] = c;
		vehicles[1] = t;

//		System.out.println(vehicles[0].getTop_speed());
//		System.out.println();
//		System.out.println(vehicles[1].getTop_speed());

		topVehicleSpeed(c);
		Tundra tundra = new Tundra();
		tundra.setVehicle_name("Tundra TRD Offroad 2023");
		System.out.println("Vehicle Name: " + tundra.getVehicle_name());
		tundra.setMiles_per_gallon(17);
		System.out.println(" \nMPG: " + tundra.getMiles_per_gallon());
		tundra.setTop_speed(165);
		System.out.println(" \nTop Speed: " + tundra.getTop_speed() + " MPH");

		Vehicle ford = new Car1();
		Vehicle tesla = new Car2();
		System.out.println("Tesla CyberTruck " + tesla.theElectric.chargeSpeed() + " Charging Speed");
		System.out.println("Ford F150 EcoBoost V6 " + ford.theElectric.chargeSpeed());
		ford.setChargeAbility(new Charge());
		System.out.println("Ford F150 Lightning " + ford.theElectric.chargeSpeed());

	}

	private static void topVehicleSpeed(Vehicle v) {

//		System.out.println(v.getTop_speed());
	}

	public static void changeObjName(Car1 fake1) {
		fake1.setVehicle_name("Toyota Prius");
	}

}
