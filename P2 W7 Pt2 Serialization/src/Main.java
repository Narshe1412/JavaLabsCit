import view.Menu;

public class Main {

	
	
	public static void main(String[] args) {
		Menu program = new Menu();
		boolean notOver = true;
		
		while(notOver) {
			program.showMenu();
			int option = program.getOption();
			notOver = program.loadOption(option);
		}
		
	}

}
