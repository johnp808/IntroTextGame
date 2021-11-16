package levels;
import java.util.Scanner;

import art.Art;
import art.Classes;
import art.Color;
import user.User;

public class Intro {
	Art art = new Art();
	Color color = new Color();
	Classes classes = new Classes();
	Scanner kb = new Scanner(System.in);
	
public void intro(User user) {
		System.out.println("                        ...                        ");
		kb.nextLine();		
		System.out.println("                        ....                        ");
		kb.nextLine();		
		System.out.println("                        .......                        ");
		kb.nextLine();		
		System.out.println(user.getName().toUpperCase() + " WAKE UP!!!!!!!!!!!!!!!!!!!!");
		kb.nextLine();
		System.out.println("The Volcanos Exploding! \n\nWe Need To Leave NOW!");
		
		System.out.println("\n1) Leave With " + user.getaI() + "..." + "\n\n2) Stay\n");
		System.out.println(color.YELLOW_BOLD_BRIGHT);
		int userChoice = kb.nextInt();
		System.out.println(color.RESET);
		kb.nextLine();
		
		while(userChoice > 2) {
			System.out.println("\n" + user.getName() + " Stop Playing We Need To Leave Now...");
			System.out.println("\n1) Leave With Keali`i..." + "\n\n2) Stay\n");
			userChoice = kb.nextInt();
			kb.nextLine();
		}
			if(userChoice == 1) {
			System.out.println("\n" + user.getaI() + " Grabs You By The Hand And Rushes You Out The Door...");
			kb.nextLine();
			userChoice = 1;
			}
				else if(userChoice == 2) {
				System.out.println("\nYou Hesitate For Just A Moment And See Something Shining Behind The Open Door...");
				art.shiningDoor();
				kb.nextLine();
				System.out.println("You Look Behind The Door And Find A "+ color.YELLOW_BOLD_BRIGHT + "Silver Sword" + color.RESET + "!");
				user.setWeapon("Silver Sword!");
				user.setWeaponStrength(user.getWeaponStrength() + 3);
				user.setTotalAttack();
				kb.nextLine();
				System.out.println("You Now Have " + user.getWeapon() + " With A Weapon Strength Of " + color.GREEN + user.getWeaponStrength() + color.RESET + "!\n\n"
				+ user.getName() + " Now Has A Total Attack Of " + color.GREEN + user.getTotalAttack() + color.RESET);
				kb.nextLine();
				userChoice = 2;
				}
			System.out.println("Lets Get Out Of Here " + user.getaI() + "!!!\n");
			kb.nextLine();
			art.exitDoor();
			kb.nextLine();			
			user.stats();
			kb.nextLine();
	}
}
