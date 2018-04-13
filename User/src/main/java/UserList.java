import java.util.ArrayList;
import java.util.Collections;

public class UserList {

	public static void main(String[] args) {

		/**
		 * we initialize the constructor and enter the data in the list with user.add.
		 */
		ArrayList<User> users = new ArrayList<User>();
		User u1 = new User("Alexia", 26, false);
		users.add(u1);
		User u2 = new User("Alex", 12, true);
		users.add(u2);
		User u3 = new User("Alexis", 6, true);
		users.add(u3);
		User u4 = new User("Amélie", 48, false);
		users.add(u4);
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
		User u10 = new User("test", 0, true);
		users.add(u10);

		Collections.sort(users);
		/**
		 * we use users.size for had the number of element in tab. users.get(index) take
		 * the element with the index of user.
		 */

		printer(users);
		System.out.println(users.size());
		suppOld(users);

		System.out.print("\n supprimons les vieux et cela donne: \n");
		printer(users);

	}

	private static void suppOld(ArrayList<User> users) {
		for (int i = 0; i < users.size(); i++) {
			System.out.println("test");
			if ((users.get(i)).getAge() < 20) {

				// effet de bords présent du la boucle for. 
				// quand on en supprime un, l'indexation change sans prendre en considération la suppression.
				//plutôt utiliser iterator.
				users.remove(i);

			}
			

		}

	}
	
	private static void suppOldIterator() {
		
	}

	public static void printer(ArrayList<User> users) {
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).toString());

		}
	}
}
