package net.oracle;

import net.oracle.Electric.CanNotCharge;

public class Car1 extends Vehicle {

	public void vinNumber() {
		System.out.println("#VUI@#B22r32r97012");
	}

	public Car1() {
		super();
		setTop_speed(120);
		
		theElectric = new CanNotCharge();
		
	}

}
