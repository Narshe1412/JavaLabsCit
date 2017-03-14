import java.io.File;
import java.util.Scanner;

/* Write a program which asks the user for an (existing) directory path on their system.

It should then goes through that directory counting the number of file and directories which it contains and outputs this information to the user.

Read in the file path as a String using Scanner. Remember to replace the \ with \\ (for this look at the replace method of String) 

 * 
 * */
public class MainDirectories {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter a path on your computer");
		String keyboard = sc.next();
		String dirname = keyboard.replace("\\", "\\\\");
		System.out.println("You typed " + dirname);
		File path = new File(dirname);
		
		if (path.exists()) {
			File[] contents = path.listFiles();
			int countDirs = 0;
			int countFiles = 0;
			for (int i=0; i<contents.length; i++) {
				if (contents[i].isDirectory()) countDirs++;
				if (contents[i].isFile()) countFiles++;
			}
			System.out.println("The folder " + dirname + " contains: ");
			System.out.println(countDirs + " directories and " + countFiles + " files.");
		} else {
			System.out.println("This path does not exists in your computer");
		}
	}
}
