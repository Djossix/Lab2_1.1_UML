package factory;

import product.*;

public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		System.out.println("ProductA1");
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		System.out.println("ProductB1");
		return new ProductB1();	
	}
	
}
