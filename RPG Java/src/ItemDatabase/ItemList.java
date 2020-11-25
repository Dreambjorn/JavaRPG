package ItemDatabase;

import java.io.File; // Import the File class
import java.io.FileInputStream;
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

public class ItemList extends Item {
	public static void main(String[] args) {
		Item data = new Item();
		try {
			File Obj = new File("items.txt");
			FileInputStream is = new FileInputStream(Obj);
			
			byte[] byteArray = new byte[(int) Obj.length()];
			
			try {
				is.read(byteArray);
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			String byteData = new String(byteArray);
			
			String[] stringArray = byteData.split("\r\n");
			
			int count = stringArray.length/4;
			
			Scanner reader = new Scanner(Obj);
			while (reader.hasNextLine()) {
				data.id = reader.nextInt();
				data.title = reader.nextLine();
				data.description = reader.nextLine();
				data.atk = reader.nextInt();
			}
			reader.close();	
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}