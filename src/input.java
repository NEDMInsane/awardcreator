import java.util.Scanner;

public class input {
	static Scanner scanner = new Scanner(System.in);
	
	public static String userStringGetter() {
		String userIn = new String(scanner.nextLine().toUpperCase());
		return userIn;
	}
	
	public static Boolean userBoolGetter() {
		String userIn = scanner.nextLine().toUpperCase();
		
		while (!userIn.equals("Y") &&
				!userIn.equals("YES") &&
				!userIn.equals("N") &&
				!userIn.equals("NO")) {
			System.out.println("Please enter Yes or No (Y/N)");
			userIn = scanner.nextLine().toUpperCase();
		
		}
		
		if (userIn.equals("Y")) {
			return true;
		} else if (userIn.equals("YES")) {
			return true;
		} else if (userIn.equals("N")){
			return false;
		} else if (userIn.equals("NO")) {
			return false;
		} else {
			return null;
		}
	}

}
