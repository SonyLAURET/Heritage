package creature.regime;

import creature.Food;

public abstract class Herbivorous extends Regime {

	Herbivorous (String regime){
		super(regime);
	}
	public void eat(Food food) {
		System.out.println("l'animal mange des végétaux.");
		
	}
}
