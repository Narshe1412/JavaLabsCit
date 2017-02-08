
public class Elf {
	public static final int NUMBER_OF_ELVES = 10,
			SALARY_PER_HOUR = 30;
	String elfName="";
	int hoursWorked = 0;
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public String getElfName() {
		return elfName;
	}
	public void setElfName(String elfName) {
		this.elfName = elfName;
	}
	public int getSalary() {
		return hoursWorked * SALARY_PER_HOUR;
	}
	
}
