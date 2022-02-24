import java.util.Scanner;

public class input {
	static Scanner scanner = new Scanner(System.in);
	
	public static String userStringGetter() {
		String userIn = new String(scanner.nextLine().toUpperCase());
		return userIn;
	}
	
	public static Boolean userBoolGetter() {
		String userIn = new String(scanner.nextLine().toUpperCase());
		if (userIn.equals("Y")) {
			return true;
		} else if (userIn.equals("N")) {
			return false;
		} else {
			return null;
		}
	}

}
