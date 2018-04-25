package factory;

import product.*;

public class ConcreteFactory2 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		System.out.println("ProductA2");
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		System.out.println("ProductB2");
		return new ProductB2();
	}

}
