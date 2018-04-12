package creature.regime;

import creature.Food;

public abstract class Omnivore extends Regime {

	public Omnivore(String regime) {
		super(regime);	
	}
	
	public void eat(Food food) {
		System.out.println("mange de tout.");
		
	}

}
