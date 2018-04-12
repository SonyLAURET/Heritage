package creature;

public abstract class Animal {
	protected int age;
	protected float weight;
	protected float size;
	protected String name;
	private Food food;
	private int speed;
	
	public abstract void eat(Food food);
	
	public void moove() {
		if (speed > 0) {
			System.out.println("l'animal bouge.");
		}else {
			System.out.println("l'animal ne bouge pas.");
		}
		
		
	}

}
