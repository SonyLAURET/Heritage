package creature.regime;

import creature.Food;

public abstract class Regime {
	private String regime;
	

	public Regime(String regime) {
		this.regime = regime;
	}

	public abstract void eat(Food food);



}
