import java.util.ArrayList;
import java.util.Collections;

public class UserList {

	public static void main(String[] args) {

		/**
		 * we initialize the constructor and enter the data in the list with user.add.
		 */
		ArrayList<User> users = new ArrayList();
		User u1 = new User("Alexia", 26, false);
		users.add(u1);
		User u2 = new User("Alex", 12, true);
		users.add(u2);
		User u3 = new User("Alexis", 6, true);
		users.add(u3);
		User u4 = new User("Am�lie", 48, false);
		users.add(u4);
		User u5 = new User("Ana�s", 22, false);
		users.add(u5);
		User u6 = new User("Antoine", 26, true);
		users.add(u6);
		User u7 = new User("Benjamin", 1001, true);
		users.add(u7);
		User u8 = new User("Alice", 18, false);
		users.add(u8);
		User u9 = new User("C�dric", 1, true);
		users.add(u9);
		User u10 = new User("test", 0, true);
		users.add(u10);

		Collections.sort(users);
		/**
		 * we use users.size for had the number of element in tab. users.get(index) take
		 * the element with the index of user.
		 */
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).toString());

		}

	}

}