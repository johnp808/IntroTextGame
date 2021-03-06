package game;

import java.util.Scanner;

import art.Color;
import levels.AllLevels;
import save.Save;
import user.User;

public class MainMenu {
	Scanner kb = new Scanner(System.in);
	AllLevels aL = new AllLevels();
	User user = new User();
	Color color = new Color();
	Save save = new Save();
	boolean quit = false;

	public void mainMenu() {

		while (!quit) {
			
			System.out.println(
					  "                                                   \n"
					+ "                                                   \n"
					+ color.BLUE_BACKGROUND_BRIGHT + color.WHITE_BOLD_BRIGHT 
					+ "***************************************************\n"
					+ "*                                                 *\n"
					+ "*                                                 *\n"
					+ "*      Please Select From One Of The Choices      *\n"
					+ "*                                                 *\n"
					+ "* 1.          * Start Your Adventure *            *\n"
					+ "*                                                 *\n"
					+ "* 2.                * Continue *                  *\n"
					+ "*                                                 *\n"
					+ "* 3.            * Check High Score *              *\n"
					+ "*                                                 *\n"
					+ "* 4.                * Credits *                   *\n"
					+ "*                                                 *\n"
					+ "* 5.                 * Quit *                     *\n"
					+ "*                                                 *\n"
					+ "***************************************************\n"
					+ color.RESET + "\n\n              " + color.BLUE_BACKGROUND_BRIGHT + color.WHITE_BOLD_BRIGHT
					+ "Please Select A Choice: \n" + color.RESET + color.YELLOW_BOLD_BRIGHT);
			int userMenuChoice = kb.nextInt();
			System.out.println(color.RESET);
			kb.nextLine();
			if (userMenuChoice == 1) {
				run();
			}
				else if (userMenuChoice == 2) {
					System.out.println("\n");
					System.out.println("WIP");
					save.loadData();
				}
			 else if (userMenuChoice == 3) {
				System.out.println("\n");
				highScore();
			} else if (userMenuChoice == 4) {
				System.out.println("\n");
				credits();
			} else if (userMenuChoice == 5) {
				System.out.println("\n");
				quit = true;
				System.out.println("GoodBye!");
			} 
			else {
				System.out.println();
			}
		}
		kb.close();
	}

	public void run() {
		aL.run();
		quit = true;
	}

	public void highScore() {
		System.out.println("              No High Score Yet...\n");
		kb.nextLine();
	}

	public void credits() {
		System.out.println("           Created By: UzidontBrick...\n");
		kb.nextLine();
	}
	
	

}
