package mainGame;
import entity.PlayerClass;

public class GameRun extends DataInit
{
	//private static String choice = "Fight for your life";
	//private static String name;
	public static PlayerClass player = new PlayerClass(); // = playerInit();
	//public static boolean checkBattle = false;
	
	//public static void main(String[] args)
	public static void run()
	{
		player = DataInit.playerInit();
		DataInit.dataInit();
	}
		//player.setMaxAtk(itemId.itemData[player.getEqItem()].getAtk());
		/*region.regionData[0].toString();
		System.out.println();
		enemy.enemyData[0].toString();
		System.out.println();
		itemId.itemData[0].toString();
		... -> text and dialogue - checked
		System.out.println();
		... -> text and dialogue + choice - checked
		String choice = ...;*/
		
		//player.toString();
		//... -> battle begins
		//unknown person tricks you and let you fight alone
		/*System.out.println();
		BattleSystem.autoBattle(1, 2);
		System.out.println();*/
		/*for(int i = 0; i < player.getItemCount(); i ++)
		{
			System.out.println(itemId.itemData[player.getInventory(i)].getTitle());
		}*/
}
