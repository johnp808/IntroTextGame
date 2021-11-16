package game;

public class MainGameApp {
	MainMenu mM = new MainMenu();

	public static void main(String[] args) {
		MainGameApp Mga = new MainGameApp();
		Mga.run();
	}
	
	public void run() {
		mM.mainMenu();
	}
	

}
