public class AwardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainArg = args[0];
		if (mainArg.equals("-cl")) {
			System.out.println("-cl was passed!");
			MainMenu.CLMM();
		} else if (mainArg.equals("-gui")) {
			System.out.println("-gui was passed!");
			MainMenu.GUIMM();
		}
			
	}

}
