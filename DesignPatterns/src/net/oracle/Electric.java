package net.oracle;

public interface Electric {

	String chargeSpeed();

	public class Charge implements Electric {

		@Override
		public String chargeSpeed() {
			
			return "3 Hours";
		}

	}
	
	public class CanNotCharge implements Electric {

		@Override
		public String chargeSpeed() {
			
			return "Not Electric Vehicle";
		}

	}

}