
import java.util.ArrayList;


public class Student {

	private String rank;
		
	private String firstName;
	private String middleInitial;
	private String lastName;
	
	private String AFSC;
	private String base;
	private ArrayList<String> awards;
	
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		//FullName only needs a getter, no need to set something we already have.
		String fullName = getFirstName() + " " + getMiddleInitial() + " " + getLastName();
		return fullName;
	}

	public String getAFSC() {
		return AFSC;
	}
	public void setAFSC(String AFSC) {
		this.AFSC = AFSC;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public ArrayList<String> getAwards() {
		return awards;
	}
	public void setAwards(ArrayList<String> awards) {
		this.awards = awards;
	}
	
}
