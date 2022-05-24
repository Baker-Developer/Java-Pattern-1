package net.oracle;

import net.oracle.Electric.Charge;

public class Car2 extends Vehicle {

	public void vinNumber() {
		System.out.println("#VUI31243340000");
	}
	
	public Car2() {
		super();
		setTop_speed(150);
		
		theElectric = new Charge();
	}
	
}
