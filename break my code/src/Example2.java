import java.util.ArrayList;
import java.util.Collections;

//hard 
@SuppressWarnings(value = { "all" })
public class Example2 {
	public static double computeAvg(ArrayList<Integer> list){
		if(list.size() == 0){
			return 0.0;
		}
		double total = 0.0;
		for(int i = 0; i < list.size(); ++i){
			total += list.get(i);
		}

		return total/list.size();
	}
	
	public static void doWork(double avg1, double avg2){
		if(avg1 > avg2){
			addNums(Double.toString(avg1), Double.toString(avg2));
		}else{
			summation((int)avg1+(int)avg2);
		}
	}
	
	public static int addNums(String one, String two){
		return (int)(Double.parseDouble(one) + Double.parseDouble(two));
	}
	
	public static int summation(int bound){
		int total = 0;
		for(int i = 0; i < bound; ++i){
			total += i;
		}
		return total;
	}
	
	public static void main(String args[]){
		addNums("50","0.0");
		double f = 0.0/0.0;
		System.out.println(f);
	}

	
}

