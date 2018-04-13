import java.util.ArrayList;

public class UserList {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList();
		User u1 = new User("Alexia", 26, false);
		users.add(u1);
		User u2 = new User("Alex", 12, true);
		users.add(u2);
		User u3 = new User("Alexis", 6, true);
		users.add(u3);
		User u4 = new User("Amélie", 48, false);
		users.add(u1);
		User u5 = new User("Anaïs", 22, false);
		users.add(u5);
		User u6 = new User("Antoine", 26, true);
		users.add(u6);
		User u7 = new User("Benjamin", 1001, true);
		users.add(u7);
		User u8 = new User("Alice", 18, false);
		users.add(u8);
		User u9 = new User("Cédric", 1, true);
		users.add(u9);
		User u10 = new User("test", 0, false);
		users.add(u10);
		
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).toString());
		}

	}
}

