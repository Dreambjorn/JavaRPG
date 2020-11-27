package ItemDatabase;

//import java.io.File;// Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner; // Import the Scanner class to read text files
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
//import java.io.FileInputStream;
//import java.io.IOException;

public class ItemList extends Item {
	//static long startTime = System.nanoTime();
	//-> use for MainGame !!!
	public static Item itemData = new Item(); // -> (WIP) array for all items list to show them in inventory
	//public static void main(String[] args) // delete this //
	public void itemData(int id) 
	{
		// Item data = new Item();
		//try {
			//File Obj = new File("items.txt");
			/*
			 * FileInputStream is = new FileInputStream(Obj);
			 * 
			 * byte[] byteArray = new byte[(int) Obj.length()];
			 * 
			 * try { is.read(byteArray); is.close(); } catch (IOException e) {
			 * e.printStackTrace(); }
			 * 
			 * String byteData = new String(byteArray);
			 * 
			 * String[] stringArray = byteData.split("\r\n");
			 * 
			 * int totalLines = stringArray.length / 4; -> Count number of lines in file
			 */

			//Scanner reader = new Scanner(Obj);
			/*
			 * for (int i = 0; i < Line; i++) { data.id = reader.nextLine(); //String skip =
			 * reader.nextLine(); data.title = reader.nextLine(); data.description =
			 * reader.nextLine(); data.atk = reader.nextInt(); }
			 */

			/*
			 * data = new Item(); data.id = reader.nextLine(); //String skip =
			 * reader.nextLine(); data.title = reader.nextLine(); data.description =
			 * reader.nextLine(); data.atk = reader.nextInt();
			 */

			/*
			 * while(reader.hasNextLine()) { if(reader.findInLine("03") != null) //Line <-
			 * String from MainGame break; reader.nextLine(); } Item data = new
			 * Item(reader.nextLine(), reader.nextLine(), reader.nextLine(),
			 * reader.nextInt());
			 */
			//int id = 1;
			JSONParser parser = new JSONParser();

			try (FileReader reader = new FileReader("items.json")) 
			{
				Object obj = parser.parse(reader);

				JSONArray itemArray = (JSONArray) obj;
				parseItems((JSONObject) itemArray.get(id));

			} catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} catch (IOException e) 
			{
				e.printStackTrace();
			} catch (ParseException e) 
			{
				e.printStackTrace();
			}

		/*} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}*/
	}
	
	private static void parseItems(JSONObject item) 
    {
        JSONObject itemObject = (JSONObject) item.get("item");
        
        itemData = new Item((String) itemObject.get("title"), 
        		Integer.parseInt((String) itemObject.get("attack")), 
        		(String) itemObject.get("description"),
        		(String) itemObject.get("role"));
        
        //itemData.toString();
        /*long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns"); */
    }
}