import java.util.ArrayList;

public class students {
	//This could probably be done way better! (Make student an object, then create objects for each student?)
	public static ArrayList<String[]> getStudRoster(){
		Boolean running = true;
		ArrayList<String[]> roster = new ArrayList<String[]>();
		
		//adding students to an arraylist we can later print out to the documents.
		while (running) {
			for (int v = 0; v == roster.size(); v++) {
				
				String[] newStud = new String[5];
				for (int i = 0; i < newStud.length; i++) {
					if (i == 0) {
						newStud[0] = getRank();
					} else if (i == 1) {
						newStud[1] = getName();
					} else if (i == 2) {
						newStud[2] = getAFSC(); 
					} else if (i == 3) {
						newStud[3] = getBase();
					} else if (i == 4) {
						newStud[4] = getAwards();
					}
				}
				roster.add(newStud);
				System.out.println("Are there more students? Youve entered " + roster.size() + " students (Y/N)");
				
				//This will break out of for and while looks, this could probably be done better.
				Boolean userinput = input.userBoolGetter();
				if (!userinput) {
					v++;
					running = false;
				}
			}	
		}
		
		
		return roster;		
	}
	
	public static void printRoster(ArrayList<String[]> roster) {
		for (int li = 0; li < roster.size(); li++) {
			String[] student = new String[5];
			student = roster.get(li);
			for (int i = 0; i < student.length; i++) {
				System.out.println(student[i]);
			}
		}
	}
	
	
	private static String getAwards() {
		System.out.println("Please enter student Awards (ACS, TG, DG, Academic Award, Flt Chief");
		return input.userStringGetter();
	}

	private static String getBase() {
		System.out.println("Please enter student Base/Squadron (Barkesdale/20 AMXS)");
		return input.userStringGetter();
	}

	private static String getAFSC() {
		System.out.println("Please enter student AFSC w/ Shredout (2A933G)");
		return input.userStringGetter();
	}

	private static String getName() {
		System.out.println("Please enter student Name (First M. Last)");
		return input.userStringGetter();
	}

	private static String getRank() {
		System.out.println("Please enter student Rank");
		return input.userStringGetter();
	}
}