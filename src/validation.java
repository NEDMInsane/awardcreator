
public class validation {
	//This is really only for command line, i could probably not even do this.
	

	public static String awdValidator(String usrStrInput) {
		if (usrStrInput.matches("ACE") | 
			usrStrInput.matches("TG") | 
			usrStrInput.matches("DG") | 
			usrStrInput.matches("AA") | 
			usrStrInput.matches("Academic Award") | 
			usrStrInput.matches("FC") |
			usrStrInput.matches("Flight Chief")) {
			return usrStrInput;
		} else {
			System.out.println("Please enter a valid Award. (ACE, TG, DG, Academic Award, Flt Chief) Not " + usrStrInput);
			awdValidator(input.userStringGetter());
			return null;
		}
		
	}
	
	public static String sqValidator(String usrStrInput) {
		//validates squadron, and matches with base.
		
		return usrStrInput;
	}
	
	public static String careerValidator(String usrStrInput) {
		//Validate AFSC, get shred-out?
		
		return usrStrInput;
	}
	
	public static String rankValidator(String usrStrInput) {
		//Validate Ranks
		if (usrStrInput.matches("AMN")| 
			usrStrInput.matches("A1C")| 
			usrStrInput.matches("SRA")| 
			usrStrInput.matches("SSGT") | 
			usrStrInput.matches("TSGT") | 
			usrStrInput.matches("MSGT") |
			usrStrInput.matches("SMSGT") |
			usrStrInput.matches("CMSGT")) {
				return usrStrInput;
			} else {
				System.out.println("Please enter a valid USAF Rank. (AMN, A1C, SRA, ...) Not " + usrStrInput);
				rankValidator(input.userStringGetter());
				return null;
			}
		
	}
}
