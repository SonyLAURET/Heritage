package creature;

import creature.regime.Regime;

public abstract class Animal {
	protected int age;
	protected float weight;
	protected float size;
	protected String name;
	private float speed;
	private Regime regime;

	protected Animal(){
		this.speed=0.0F;
		this.name="";
		this.size=0.0f;
		this.age=0;
		this.weight=0.0f;
	}
	protected Animal(int age,float weight, float size,String name,float speed) {
		this.age=age;
		this.weight=weight;
		this.size=size;
		this.name=name;
		this.speed=speed;
			}
	
	
	public void eat(Food food) {
	}

	//we try to define the movement.
	public void moove() {
		if (speed > 0) {
			System.out.println("l'animal bouge.");
		} else {
			System.out.println("l'animal ne bouge pas.");
			
		}

	}
	public String toString() {
		return "le "+name+" a "+age+" ans et pèse "+weight+"kg. Il mesure "+size+"m."+regime;
	}

	
}
