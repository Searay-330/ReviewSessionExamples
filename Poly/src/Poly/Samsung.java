package Poly;

public class Samsung extends Phone {
	String _defect;

	public Samsung(String color, String brand, int price, String defect) {
		super(color, brand, price);
		_defect = defect;
	}

	public String getDefect() {
		return _defect;
	}
}
