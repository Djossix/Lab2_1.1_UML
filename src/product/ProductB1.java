package product;

public class ProductB1 extends AbstractProductB {
	
	public ProductB1() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		
		return "This is product B1.";
	}

}
