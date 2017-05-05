import java.util.Random;
//hard
@SuppressWarnings("all")
public class Example4 {
	private static void bubbleSort(int[] intArray) {

		int n = intArray.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n + i); j++) {

				if (intArray[j - 1] < intArray[j]) {
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
				}

			}
		}

	}
	 public static int[] doInsertionSort(int[] input){
         
	        int temp;
	        for (int i = 1; i < input.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(input[j] < input[j-1]){
	                    temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                }
	            }
	        }
	        return input;
	    }
	 
	 public static void doSort(int n){
		 int[] array = new int[n];
		Random rand = new Random();
		for(int i = 0; i < n; ++i){
			array[i] = rand.nextInt(50000);
		}
		
		if(n > 50){
			doInsertionSort(array);
		}
		
		if(n == 10){
			bubbleSort(array);
		}
		
	 }
public static void main(String args[]){

}

}
