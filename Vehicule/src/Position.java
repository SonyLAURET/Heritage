
public class Position {
	private float lattitude;
	private float longitude;

	public Position() {
		this.lattitude=0.0F;
		this.longitude=0.0F;
	}
	
	public float getLattitude() {
		return lattitude;
	}

	public void setLattitude(float lattitude) {
		this.lattitude = lattitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
}
