package human;

public class human implements specs {
	 private int _height, _weight, _age = 0;
	 private String _eyecolor, _name;

	public human(int height, int weight, int age, String eyecolor, String name) {
		_height = height;
		_weight = weight;
		_age = age;
		_eyecolor = eyecolor;
		_name = name;

	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return _height;
	}

	@Override
	public void setHeight(int i) {
		// TODO Auto-generated method stub
		_height = i;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return _weight;
	}

	@Override
	public void setWeight(int i) {
		// TODO Auto-generated method stub
		_weight = i;
	}

	@Override
	public String getEyeColor() {
		// TODO Auto-generated method stub
		return _eyecolor;
	}

	@Override
	public void setEyeColor(String s) {
		// TODO Auto-generated method stub
		_eyecolor = s;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return _age;
	}

	@Override
	public void setAge(int i) {
		// TODO Auto-generated method stub
		_age = i;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return _name;
	}

}
