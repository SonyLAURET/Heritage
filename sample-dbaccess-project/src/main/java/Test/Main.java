package Test;

import creature.Animal;
import creature.animals.Lion;

public class Main {
	public static void main (String[] args) {
		Animal animal = null;
		Lion lion = new Lion(animal);
		System.out.println(lion.toString());
	}
}
