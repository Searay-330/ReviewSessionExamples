package Poly;

public class Google extends Phone {
	String _defect;

	public Google(String color, String brand, int price, String defect) {
		super(color, brand, price);
		_defect = defect;
	}

	public String getDefect() {
		return _defect;
	}
}
