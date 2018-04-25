package factory;

import product.*;

public class FamilyCarFactory extends CarFactory {

	@Override
	public FamilyCars createCarA() {
		System.out.print("Creating car A2: ");
		return new FamilyA2();
	}

	@Override
	public SportsCars createCarB() {
		System.out.print("Creating car B2: ");
		return new SportB2();
	}

}
