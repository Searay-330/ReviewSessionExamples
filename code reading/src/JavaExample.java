public class JavaExample {
 
        public static void main(String[] args) {
               
               
                int numbers[] = new int[]{121,13,11,22};
               
                for(int i=0; i < numbers.length; i++){
                       
                        int number = numbers[i];
                        int reversedNumber  = 0;
                        int temp=0;
                       
                       
                        //reverse the number
                        while(number > 0){
                                temp = number % 10;
                                number = number / 10;
                                reversedNumber = reversedNumber * 10 + temp;
                        }
                       
                        if(numbers[i] == reversedNumber){
                                System.out.println(numbers[i] + " is a palindrome number");
                        }
                        else{
                                System.out.println(numbers[i] + " is not a palindrome number");
                        }
                }
               
        }
}
 