package save;

import java.io.BufferedReader;
import java.io.FileReader;

import user.User;

public class Save {
	User user = new User();

	public void loadData() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("saveFile.txt"));
		} catch (Exception e) {

		}
	}
}
