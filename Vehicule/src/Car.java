
public class Car extends Bike {
	private float volumeEsssence;
	private float puissance;
	private float Co2;

	public Car(type type,float volumeEsssence,float puissance,float Co2) {
		super(type);
		this.volumeEsssence=volumeEsssence;
		this.puissance=puissance;
		this.Co2=Co2;
	}

}
