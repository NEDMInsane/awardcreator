import java.util.ArrayList;
import java.util.HashMap;

public class Roster {
	private static Boolean studentAdd = true;
	public static int studentNumber = 1;
	private static Student student = new Student();
	
	public static HashMap<Integer, Student> createRoster() {
		
		HashMap<Integer, Student> roster = new HashMap<Integer, Student>();
		
		while (studentAdd) {
			setStudRank();
			setStudName();
			setStudAFSC();
			setStudBase();
			//setStudAwards();
			
			roster.put(studentNumber, student);
			
			setStudAdd();
			studentNumber++;
		}
		return roster;
	}

	private static void setStudRank() {

		System.out.println("Enter student rank");
		student.setRank(Validation.rankValidator(UserInput.userStringGetter()));
		
	}
	
	private static void setStudName() {
		
		System.out.println("Whats the students First name?");
		student.setFirstName(UserInput.userStringGetter());
		System.out.println("Whats the students Middle initial?");
		student.setMiddleInitial(UserInput.userStringGetter());
		System.out.println("Whats the students Last name?");
		student.setLastName(UserInput.userStringGetter());
		//System.out.println(student.getFullName());
		
	}
	
	private static void setStudAFSC() {
		
		System.out.println("Please enter AFSC");		
		student.setAFSC(Validation.careerValidator(UserInput.userStringGetter()));
	}
	
	private static void setStudBase() {
		
		System.out.println("Enter Student Base/SQ");
		student.setBase(UserInput.userStringGetter());
		
	}
	
	private static void setStudAwards() {
		
		ArrayList<String> awards = new ArrayList<String>();
				
		awards.add(UserInput.userStringGetter());
		student.setAwards(awards);
	}
	

	private static void setStudAdd() {
		System.out.println("Are there anymore students? (Y/N)");
		Boolean usrPrompt = UserInput.userBoolGetter();
		
		if (!usrPrompt) {
			studentAdd = false;
		}
	}

	
	public static void printRoster(HashMap<Integer, Student> roster) {
		for (int i = 1 ; i < roster.size() + 1; i++) {
			String studName = roster.get(i).getFullName();
			System.out.println("Printing Names");
			System.out.println(studName);
		}
	}
}
