
public class funExample {
	public static void main(String[] args) {
		String str = " ";
		for (int i = 0; i < 256; i++) {
			if (i == 111)
				str = (char)i + str;
		}
		for (int i = 0; i < 256; i++) {
			if (i == 108) {
				str = (char) i + str;
				str = (char) i + str;
			}
		}
		for (int i = 0; i < 256; i++) {
			if (i == 101)
				str = (char) i + str;
		}
		for (int i = 0; i < 256; i++) {
			if (i == 72)
				str = (char) i + str;
		}
		for (int i = 0; i < 256; i++) {
			if (i == 87)
				str += (char) i;
		}
		for (int i = 0; i < 256; i++) {
			if (i == 111)
				str += (char) i;
		}
		for (int i = 0; i < 256; i++) {
			if (i == 114)
				str += (char) i;
		}
		for (int i = 0; i < 256; i++) {
			if (i == 108)
				str += (char) i;
		}
		for (int i = 0; i < 256; i++) {
			if (i == 100)
				str += (char) i;
		}
		System.out.println(str);
	}
}
