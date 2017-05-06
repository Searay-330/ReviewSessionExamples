package Poly;

public class IPhone extends Phone {
	String _defect;

	public IPhone(String color, String brand, int price, String defect) {
		super(color, brand, price);
		_defect = defect;
	}

	public String getDefect() {
		return _defect;
	}
}
