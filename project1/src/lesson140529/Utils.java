package lesson140529;

import java.util.Scanner;

public class Utils {

	public static void pause(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static final Scanner scanner = new Scanner(System.in); 


	public static String waitForUserInput(){
		while(!scanner.hasNextLine()){}
		return scanner.nextLine();
	}
}

