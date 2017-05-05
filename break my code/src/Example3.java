

//medium
public class Example3 {
	
	public static int divideTwoThings(Object o, Object y){
		try{
			return (int)o + (int)y;
		}catch (ClassCastException e) {
			return 0;
		}

	}
	
	public static void main(String args[]){

	}

	
}
