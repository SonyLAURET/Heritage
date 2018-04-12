package creature.regime;
import creature.Food;

public abstract class Carnassier extends Regime {

	
	Carnassier(String regime) {
		super(regime);
		
	}

	public void eat(Food food) {
		System.out.println("l'animal mange de la viande");
		
	}
}
