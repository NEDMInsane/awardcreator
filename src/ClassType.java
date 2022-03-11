
public class ClassType {
	public static String setClassType() {
		System.out.println("What Class are you creating the Awards for? (AA or MAF, AB, BB)");
		
		Boolean running = true; 
		
		while (running) {
			String ewClass = UserInput.userStringGetter();
			
			if (ewClass.equals("AA") | ewClass.equals("MAF")) {
				return classTypeConfirm("AA/MAF");
			} else if (ewClass.equals("AB")) {
				return classTypeConfirm("AB");
			} else if (ewClass.equals("BB")) {
				return classTypeConfirm("BB");
			} else {
				System.out.println("Please enter AA or MAF, AB, BB.");
			}
		}
		return null;
	}
	
	public static String classTypeConfirm(String cls) {
		System.out.println("You have selected " + cls + " correct? (Y/N)");
		Boolean response = UserInput.userBoolGetter();
		
		if(response) {
			return cls;
		} else if (!response) {
			setClassType();
		} else {
			System.out.println("Something Bad Happened!!!");
			return null;
		}
		return null;
	}
	
	public static String setClassType(String clsType) {
		return clsType;
		
	}
}
