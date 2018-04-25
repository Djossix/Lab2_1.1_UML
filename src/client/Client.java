package client;

import factory.*;
import product.*;

public class Client {

	public static void main(String[] args) {

		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractFactory factory2 = new ConcreteFactory2();
		
		AbstractProductA myProduct1 = factory1.createProductA();
		AbstractProductA myProduct2 = factory2.createProductA();
		AbstractProductB myProduct3 = factory1.createProductB();
		AbstractProductB myProduct4 = factory2.createProductB();
	}
	
}
