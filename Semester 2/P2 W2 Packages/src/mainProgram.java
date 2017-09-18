
import view.menuView;

import java.io.IOException;

import controller.personController;

public class mainProgram {
	
	static menuView menu = new menuView();
	static personController controller = new personController();

	public static void main(String[] args) throws IOException {
		int optionSelected = -1;
		final int EXIT = 3;
		
		while(optionSelected != EXIT){
			menu.printMenu();
			optionSelected = menu.chooseOption();
			switch (optionSelected){
			case 1: 
				menu.printMessage(controller.Add());
				break;
			case 2:
				menu.printMessage(controller.Lookup());
				break;
			case 3:
				menu.printMessage("Goodbye");
				break;
			default:
				optionSelected = -1;		
			}
		}
	}

}
