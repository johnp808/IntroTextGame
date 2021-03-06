package levels;

import java.util.Scanner;

import art.Art;
import art.Classes;
import art.Color;
import user.User;

public class Setup {
	Art art = new Art();
	User user = new User();
	Color color = new Color();
	Classes classes = new Classes();
	Scanner kb = new Scanner(System.in);
	
	public void tips() {
		System.out.println(
				  "                                                   \n"
				+ color.BLUE_BACKGROUND_BRIGHT + color.WHITE_BOLD_BRIGHT 
				+ "***************************************************\n"
				+ "*                                                 *\n"
				+ "*                                                 *\n"
				+ "*          If It's Your First Time Playing...     *\n"
				+ "*                                                 *\n"
				+ "*                                                 *\n"
				+ "*               Here Are Some Tips:               *\n"
				+ "*                                                 *\n"
				+ "*                                                 *\n"
				+ "*           Use Numbers For Your Choices...       *\n"
				+ "*                                                 *\n"
				+ "*                                                 *\n"
				+ "*                        Or                       *\n"
				+ "*                                                 *\n"
				+ "*                                                 *\n"
				+ "*           Answer Questions By Typing...         *\n"
				+ "*                                                 *\n"
				+ "*                                                 *\n"
				+ "* You Can Press [Enter] or [Return] To Advance... *\n"
				+ "*                                                 *\n"
				+ "*                                                 *\n"
				+ "*                    Try It Now...                *\n"
				+ "*                                                 *\n"
				+ "*                                                 *\n"
				+ "*                      [Start]                    *\n"
				+ "*                                                 *\n"
				+ "*                                                 *\n"
				+ "***************************************************\n" + color.RESET);
				kb.nextLine();
		}
	
	public void setup() {
		
		
		System.out.println("You Wake Up On The Beach Shore...");
		kb.nextLine();
		System.out.println("You Look Up And See A Small Shack Right On The Beach...\n");
		kb.nextLine();		
		art.hut();
		kb.nextLine();		
		System.out.println("\nHey Are You Okay...");
		kb.nextLine();		
		
		//                              GET NAME
		
		System.out.print("What's Your Name?\n\n" + color.YELLOW_BOLD_BRIGHT);
		user.setName(kb.nextLine());
		System.out.print(color.RESET);
		while (user.getName().isEmpty() || user.getName().equalsIgnoreCase(" ")) {
				System.out.print("Are You Okay... \n\nI Think You Might Have Hurt You Head, \n\nPlease Enter An Actual Name... \n\nWhat's Your Name Again?\n");
				System.out.println(color.YELLOW_BOLD_BRIGHT);
				user.setName(kb.nextLine());
				System.out.println(color.RESET);
		}
		
		
		System.out.println("\nOh... I See So Your Name Is " + user.getName() + "...");
		kb.nextLine();
		System.out.println("Let's Check Out Your Stats " + user.getName() + "...");
		kb.nextLine();
		user.stats();
		kb.nextLine();
		System.out.println("Cool Huh...");
		kb.nextLine();
		System.out.println("Oh! By The Way!");
		System.out.println("\nI'm " + user.getaI() + "...\n");
		kb.nextLine();
		art.kealii();
		System.out.println("\n\nNice To Meet You!");
		kb.nextLine();
		System.out.println("If We're Going To Be Stuck On This Island Together, \n\nIt's Best We Get To Know Each Other Right?");
		
		//                        	    GET GENDER
		
		System.out.println("So Tell Me " + user.getName() + "..." + kb.nextLine() + "\n\nAre You A... \n\n 1) Male \n 2) Female \n 3) Other");
		System.out.println(color.YELLOW_BOLD_BRIGHT);
		int genderChoice = kb.nextInt();
		System.out.println(color.RESET);
		kb.nextLine();
		while(genderChoice > 3) {
			System.out.println("Oops I'm Sorry That's Not A Gender Option,\n\nLet's Try Again\n");
			System.out.println("So Tell Me " + user.getName() + "... \n\nAre You A... \n\n 1) Male \n 2) Female \n 3) Other");
			System.out.println(color.YELLOW_BOLD_BRIGHT);
			genderChoice = kb.nextInt();
			System.out.println(color.RESET);
			kb.nextLine();
		}
		if(genderChoice == 1) {
			user.setGender("Male");
			}
			else if(genderChoice == 2) {
				user.setGender("Female");

			}
			else if(genderChoice == 3) {
				user.setGender("Other");
		}
		System.out.println("Oh... So You Associate With " + user.getGender() + "s...");
		kb.nextLine();

		
		System.out.println("Cool");
		kb.nextLine();
		
		System.out.println("Now...");
		kb.nextLine();
		
		//                        	    GET AGE
		
		System.out.println("How Old Are You " + user.getName() + "?...");
		System.out.println(color.YELLOW_BOLD_BRIGHT);
		user.setAge(kb.nextInt());		
		System.out.println(color.RESET);

		kb.nextLine();
		System.out.println("Hmm, Are You Sure You're " + user.getAge() + "...");
		kb.nextLine();		
		System.out.println("Okay, \n\nWhatever You Say " + user.getName() + "...");
		kb.nextLine();
		
		//								Choose Path
		System.out.println("So...");
		kb.nextLine();
		System.out.println("Do You Like Using... \n\n1) Muscles \n\nOr \n\n2) Magic");
		System.out.println(color.YELLOW_BOLD_BRIGHT);
		int path = kb.nextInt();
		kb.nextLine();
		System.out.println(color.RESET);
		while(path > 2) {
			System.out.println("\nYou're Obviously Tired...\n");
			System.out.println("Do You Like Using Your... \n\n1) Muscles \n\nOr \n\n2) Magic");
			System.out.println(color.YELLOW_BOLD_BRIGHT);
			path = kb.nextInt();
			kb.nextLine();
			System.out.println(color.RESET);
		}
		if(path == 1) {
			System.out.println("You Feel Your Muscles Grow Larger...");
			kb.nextLine();
			user.setHealth(user.getHealth() + 20);
			System.out.println(color.GREEN + "+20" + color.RESET + " Health\n");
			System.out.println(user.getName() + " Now Has A Max HP Of " + color.GREEN + user.getHealth() + color.RESET);
			kb.nextLine();
			user.setAttackStrength(user.getAttackStrength() + 2);
			System.out.println(color.GREEN + "+2"+ color.RESET + " Attack Strength\n");
			System.out.println(user.getName() + " Now Has A Max Atk Str Of " + color.GREEN + user.getAttackStrength() + color.RESET);
			kb.nextLine();
			user.setMana(user.getMana() - 30);
			System.out.println(color.RED_BRIGHT + "-30" + color.RESET + " Mana\n");
			System.out.println(user.getName() + " Now Has A Max MP Of " + color.BLUE_BRIGHT + user.getMana() + color.RESET);
			kb.nextLine();
			System.out.println("You're A "+ classes.FIGHTER +" " + user.getName() + "...");
			kb.nextLine();
			
		}
		if(path == 2) {
			user.setSpell("Tesla Spark!");
			System.out.println("You Feel Your Fingers Tingling...");
			kb.nextLine();
			System.out.println(user.getName() + " Learned The Spell " + user.getSpell());
			kb.nextLine();
			user.setHealth(user.getHealth() - 20);
			System.out.println(color.RED_BRIGHT +"-20"+ color.RESET +" Health\n");
			System.out.println(user.getName() + " Now Has A Max HP Of " + color.RED_BRIGHT + user.getHealth() + color.RESET);
			kb.nextLine();
			user.setSpellStrength(user.getSpellStrength() + 30);
			System.out.println(color.GREEN + "+30" + color.RESET + " Spell Strength\n");
			System.out.println(user.getName() + " Now Has A Max Spell Str Of "+ color.GREEN + user.getSpellStrength() + color.RESET);
			kb.nextLine();
			user.setMana(user.getMana() + 30);
			System.out.println(color.GREEN + "+30" + color.RESET + " Mana\n");
			System.out.println(user.getName() + " Now Has A Max MP Of " + color.BLUE_BRIGHT + user.getMana() + color.RESET);
			kb.nextLine();
			System.out.println("You're A " + classes.WIZARD + ", \n\nHarry...");
			kb.nextLine();
			System.out.println("Oops...");
			kb.nextLine();
			System.out.println("Sorry " + user.getName() +  "...");
			kb.nextLine();
			System.out.println("YOU'RE A " + classes.WIZARD + ",\n\n" + user.getName() + "...");
			kb.nextLine();
			
			
		}
		
		
		System.out.println("Wow That Was Tiring, \n\nI Think That's Enough Getting To Know Each Other For Now...");
		kb.nextLine();		
		System.out.println("I'll Leave You To Rest Til Morning Before We Head Out,\n\nGoodnight!");
		kb.nextLine();
		System.out.println("1) Say Goodnight To " + user.getaI() +"...\n\n2) Say Nothing");
		System.out.println(color.YELLOW_BOLD_BRIGHT);
		int userChoice = kb.nextInt();
		System.out.println(color.RESET);
		kb.nextLine();
		
		
		// 								GOOD WAY OF USING WHILE LOOP FOR BAD CHOICES FOR NUMBERS 
		while(userChoice > 2) {
			System.out.println("\nSomehow You Think You Were Supposed To Select A Choice From The Numbers Listed...");
			System.out.println("\n1) Say Goodnight To " + user.getaI() +"...\n\n2) Say Nothing");
			System.out.println(color.YELLOW_BOLD_BRIGHT);
			userChoice = kb.nextInt();
			System.out.println(color.RESET);
			kb.nextLine();
		}
		if(userChoice == 1) {
		System.out.println(user.getaI() + " Smiles And Disappear Silently To His Room Closing The Door Behind Him...\n\n");
		userChoice = 1;
		}
		else if(userChoice == 2) {
			System.out.println(user.getaI() + " Looks At You Puzzled, \n\nThen Sulks To His Room Closing The Door...");
			userChoice = 2;
		}
		art.door();
		kb.nextLine();
		System.out.println("                                ");		
		System.out.println("                     '          ");
		System.out.println("            *          .        ");
		System.out.println("                   *        '   ");
		System.out.println("              *                *");
		System.out.println("                                ");
		System.out.println("                                ");
		System.out.println("          That Night " + user.getName() + " Slept...  ");
		System.out.println("\n       And Dreamt Of An Ancient Past...  ");
		System.out.println("\n    That Somehow Never Felt All That Distant...  ");
		System.out.println("                                ");
		System.out.println("                                ");
		System.out.println("   *    *                       ");
		System.out.println("           *                    ");
		System.out.println("                *               ");
		System.out.println("                       *        ");
		System.out.println("               *                ");
		System.out.println("                     *          ");
		kb.nextLine();
		user.stats();
		kb.nextLine();			
	}
	public User getUser() {
		return this.user;
	}
}
