import java.util.ArrayList;

public class JavaExample {
 
        public static void main(String[] args) {
               
               ArrayList<Integer> numbers = new ArrayList<Integer>();
               numbers.add(121);
               numbers.add(13);
               numbers.add(11);
               numbers.add(22);
               
                for(int i=0; i < numbers.size(); i++){
                       
                        int number = numbers.get(i);
                        int reversedNumber  = 0;
                        int temp=0;
                       
                       
                        //reverse the number
                        while(number > 0){
                                temp = number % 10;
                                number = number / 10;
                                reversedNumber = reversedNumber * 10 + temp;
                        }
                       
                        if(numbers.get(i) == reversedNumber){
                                System.out.println(numbers.get(i) + " is a palindrome number");
                        }
                        else{
                                System.out.println(numbers.get(i) + " is not a palindrome number");
                        }
                }
               
        }
}
 