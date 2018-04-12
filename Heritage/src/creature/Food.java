package creature;

public abstract class Food {
	private String vegetal;
	private String animal;
	private String name;

	//we suppose in initial position,the animal move and so don't eat.
	private void Food() {
		System.out.println("l'animal  mange.");
	}

	//we link the speed with the movement and the capacity to eat.
	private void Food(int speed) {
		if (speed == 0) {
			Food();
		} else {
			System.out.println("l'animal ne mange pas.");
		}
	}

	//we find the type of regime.
	public enum Feed {
		meat("viande"),vegetal("vegetal"),both("les deux");
		
		String type;
		Feed (String type){type =type;}
		public String regime() {
			return type;
		}
	}

}
