package factory;

public class ConcreteFactory2 extends AbstractFactory {

	@Override
	public void createProductA() {
		System.out.println("ProductA2");
	}

	@Override
	public void createProductB() {
		System.out.println("ProductB2");
	}

}
