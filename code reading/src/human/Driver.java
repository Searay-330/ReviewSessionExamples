package human;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		human humanOne = new human(5, 110, 20, "blue", "Glenn");
		human humanTwo = new human(6, 180, 35, "green", "Carl");
		human humanThree = new human(4, 95, 40, "brown", "Jessie");
		human humanFour = new human(5, 120, 15, "black", "Dave");
		human humanFive = new human(7, 200, 25, "hazel", "Luke");
		ArrayList<human> TitanFood = new ArrayList<human>();
		ArrayList<human> humansAlive = new ArrayList<human>();
		ArrayList<human> humansDead = new ArrayList<human>();
		TitanFood.add(humanOne);
		TitanFood.add(humanTwo);
		TitanFood.add(humanThree);
		TitanFood.add(humanFour);
		TitanFood.add(humanFive);

		for (int i = 0; i < TitanFood.size(); i++) {
			if (TitanFood.get(i).getAge() > 20 && TitanFood.get(i).getWeight() > 130) {
				humansDead.add(TitanFood.get(i));
			} else {
				humansAlive.add(TitanFood.get(i));
			}
		}
		System.out.println("Humans Alive");
		for (int i = 0; i < humansAlive.size(); i++) {
			System.out.print(" " + "-" + " " + humansAlive.get(i).getName());
		}
		System.out.println();
		System.out.println("Humans Dead");
		for (int i = 0; i < humansDead.size(); i++) {
			System.out.print(" " + "-" + " " + humansDead.get(i).getName());
		}

	}

}
