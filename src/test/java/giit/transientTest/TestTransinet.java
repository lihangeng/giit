package giit.transientTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestTransinet {

	public static void main(String[] args) {

		UserInfo userInfo = new UserInfo("wwe","hhh");
		File file = new File("E:test.out");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(userInfo);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			UserInfo user = (UserInfo) ois.readObject();
			System.out.println(user.toString());
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
