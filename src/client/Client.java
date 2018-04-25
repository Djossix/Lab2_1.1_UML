package client;

import factory.*;
import product.*;

public class Client {

	public static void main(String[] args) {

		CarFactory factoryS = new SportsCarFactory();
		CarFactory factoryF = new FamilyCarFactory();
		
		FamilyCars myCar1 = factoryS.createCarA();
		FamilyCars myCar2 = factoryF.createCarA();
		SportsCars myCar3 = factoryS.createCarB();
		SportsCars myCar4 = factoryF.createCarB();
	}
	
}
