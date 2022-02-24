
public class mainMenu {

	public static void CLMM() {
		//creating of Command-line main menu
		System.out.println("Welcome to the Easy Award Creation Tool");
		System.out.println("This is the command-line variant, for GUI use GUI Executable");
		String classVar = classType.getClassType();
		
		System.out.println("Now time for students...");
		students.printRoster(students.getStudRoster());
		
	}
	
	public static void GUIMM() {
		//gui needs to be created still!
	}
}
