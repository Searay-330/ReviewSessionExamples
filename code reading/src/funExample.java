
public class funExample {
	public static void main(String[] args) {

		String str = " ";

		for (int i = 0; i < 256; i++) {

			if (i == 111)
				str = (char) 111 + str;

		}

		for (int i = 0; i < 256; i++) {

			if (i == 108) {

				str = (char) 108 + str;

				str = (char) 108 + str;

			}

		}

		for (int i = 0; i < 256; i++) {

			if (i == 101)
				str = (char) 101 + str;

		}

		for (int i = 0; i < 256; i++) {

			if (i == 72)
				str = (char) 72 + str;

		}

		for (int i = 0; i < 256; i++) {

			if (i == 87)
				str += (char) 87;

		}

		for (int i = 0; i < 256; i++) {

			if (i == 111)
				str += (char) 111;

		}

		for (int i = 0; i < 256; i++) {

			if (i == 114)
				str += (char) 114;

		}

		for (int i = 0; i < 256; i++) {

			if (i == 108)
				str += (char) 108;

		}

		for (int i = 0; i < 256; i++) {

			if (i == 100)
				str += (char) 100;

		}

		System.out.println(str);

	}
}