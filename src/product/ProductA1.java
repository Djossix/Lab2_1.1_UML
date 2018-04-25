package product;

public class ProductA1 extends AbstractProductA {
	
	public ProductA1() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		
		return "This is product A1.";
	}

}
