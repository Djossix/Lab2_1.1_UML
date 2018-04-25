package factory;

import product.*;

public class SportsCarFactory extends CarFactory {

	@Override
	public FamilyCars createCarA() {
		System.out.print("Creating car A1: ");
		return new FamilyA1();
	}

	@Override
	public SportsCars createCarB() {
		System.out.print("Creating car B1: ");
		return new SportB1();	
	}
	
}
