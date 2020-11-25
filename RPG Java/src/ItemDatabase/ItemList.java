package ItemDatabase;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
//import java.io.FileInputStream;
//import java.io.IOException;

public class ItemList extends Item
{
	//public void itemData(int Line)
	public static void main(String[] args) //delete this
	{
		Item data = new Item();
		try 
		{
			File Obj = new File("items.txt");
			int Line = 0; //delete this
			/*FileInputStream is = new FileInputStream(Obj);

			byte[] byteArray = new byte[(int) Obj.length()];

			try {
				is.read(byteArray);
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			String byteData = new String(byteArray);

			String[] stringArray = byteData.split("\r\n");

			int totalLines = stringArray.length / 4; -> Count number of lines in file*/

			Scanner reader = new Scanner(Obj);
			for (int i = 0; i < Line; i++) 
			{
				data.id = reader.nextInt();
				String skip = reader.nextLine();
				data.title = reader.nextLine();
				data.description = reader.nextLine();
				data.atk = reader.nextInt();
			}
			
			data = new Item();
			data.id = reader.nextInt();
			String skip = reader.nextLine();
			data.title = reader.nextLine();
			data.description = reader.nextLine();
			data.atk = reader.nextInt();
			
			data.toString();
			
			reader.close();

		} catch (FileNotFoundException e) 
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}