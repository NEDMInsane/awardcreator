import java.util.Scanner;

public class awardmain {
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	    String selection = "";
	    
	    System.out.println("Please select an option");
        System.out.println("1 - Command Line");
        System.out.println("2 - GUI");
        
        selection = scan.next();
        
        while(!selection.equals("1") && !selection.equals("2")) {
            System.out.println("Please only select a number from the options below");
            System.out.println("1 - Command Line");
            System.out.println("2 - GUI");
            selection = scan.next();
        }
	        
        
        if (selection.equals("1")) {
            System.out.println("-cl was passed!");
            mainMenu.CLMM();
        } else if (selection.equals("2")) {
            System.out.println("-gui was passed!");
            //mainMenu.GUIMM();
        }
	    
		// TODO Auto-generated method stub
		/*String mainArg = args[0];
		if (mainArg.equals("-cl")) {
			System.out.println("-cl was passed!");
			mainMenu.CLMM();
		} else if (mainArg.equals("-gui")) {
			System.out.println("-gui was passed!");
			//mainMenu.GUIMM();
		}*/
			
	}

}
