package regionsDatabase;

import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RegionList // determining specific regions' enemies
{
	// public Enemy enemyData = new Enemy();
	public Region regionData[] = new Region[10];
	private int count = 0;

	// public static void main(String[] args)
	@SuppressWarnings("unchecked")
	public void regionData(/* int id */) 
	{
		// int id = 1;
		JSONParser parser = new JSONParser();

		try (FileReader reader = new FileReader("region.json")) 
		{
			Object obj = parser.parse(reader);

			JSONArray regionArray = (JSONArray) obj;
			// parseEnemy((JSONObject) enemyArray.get(id));
			regionArray.forEach(emp -> parseRegion((JSONObject) emp));

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
	}

	private void parseRegion(JSONObject region) 
	{
		JSONObject regionObject = (JSONObject) region.get("region");

		/*
		 * this.enemyData = new Enemy((String) enemyObject.get("name"), (int)
		 * Integer.parseInt((String) enemyObject.get("attack")), (String)
		 * enemyObject.get("description"), (int) Integer.parseInt((String)
		 * enemyObject.get("item")), (int) Integer.parseInt((String)
		 * enemyObject.get("basehp")), (int) Integer.parseInt((String)
		 * enemyObject.get("basexp")));
		 */
		String enemyIdList;
		enemyIdList = (String) regionObject.get("enemyid");
		this.regionData[count] = new Region((String) regionObject.get("name"),
				(String) regionObject.get("description"),
				(int) Integer.parseInt((String) regionObject.get("reqlevel")));
		this.regionData[count].setEnemyId(enemyIdList.toCharArray());
		//this.regionData[count] = new Region(enemyIdList.toCharArray()); -> it resets the object to null
		count++;
		// enemyData.toString();
		/*
		 * long endTime = System.nanoTime(); System.out.println("Took "+(endTime -
		 * startTime) + " ns");
		 */
	}
}
