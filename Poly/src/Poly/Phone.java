package Poly;

public class Phone {
	String _color, _brand;
	int _price;

	public Phone(String color, String brand, int price) {
		_color = color;
		_brand = brand;
		_price = price;
	}

	public int getPrice() {
		return _price;
	}

	public String getColor() {
		return _color;
	}

	public String getBrand() {
		return _brand;
	}
}
