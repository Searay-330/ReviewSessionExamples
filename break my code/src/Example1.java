import java.util.ArrayList;

//easy
public class Example1 {
	public static double computeFloorAvg(ArrayList<Integer> list){
		int total = 0;
		for(int i = 0; i < list.size(); ++i){
			total += list.get(i);
		}

		return (total/list.size());
	}
	
	public static void main(String args[]){
		computeFloorAvg(new ArrayList<>());
	}


}
