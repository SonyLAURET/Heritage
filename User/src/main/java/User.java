
public class User {

	private String name;
	private int age;
	boolean isMale;

	User(String name, int age, boolean isMale) {
		this.name = name;
		this.isMale = isMale;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public String toString() {
		return "name=" + name + ", age=" + age + ", isMale=" + isMale;
	}
	
	

}
