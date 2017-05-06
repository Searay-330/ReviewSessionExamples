package Poly;

public class driver {

	public static void main(String[] args) {
		IPhone IPhoneSeven = new IPhone("Black", "Apple", 700, "Bending");
		Samsung SamsungSeven = new Samsung("Silver", "Samsung", 650, "Battery");
		Google Pixel = new Google("White", "Google", 750, "Audio");

		System.out.println(IPhoneSeven.getColor());
		System.out.println(SamsungSeven.getColor());
		System.out.println(Pixel.getColor());

		Phone generic = new Phone("Black", "Sony", 300);
		System.out.println(generic.getPrice());

		Phone randPhone = new IPhone("Red", "Apple", 650, "Screen");
		System.out.println(randPhone.getColor());
		//System.out.println(randPhone.getDefect()); // I Can't do this, try to figure out why I can't :)
	}

}
