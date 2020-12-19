package mainGame;
import entity.PlayerClass;

public class GameRun extends DataInit
{
	private static String choice = "Fight for your life";
	private static String name = "Husbando";
	public static PlayerClass player = playerInit();
	public static boolean checkBattle = false;
	
	public static void main(String[] args)
	{
		
		dataInit();
		
		region.regionData[0].toString();
		System.out.println();
		enemy.enemyData[0].toString();
		System.out.println();
		itemId.itemData[0].toString();
		//... -> text and dialogue
		System.out.println();
		//... -> text and dialogue + choice
		//String choice = ...;
		player.setMaxAtk(itemId.itemData[player.getEqItem()].getAtk());
		player.toString();
		//... -> battle begins
		//unknown person tricks you and let you fight alone
		System.out.println();
		BattleSystem.autoBattle(1, 2);
		System.out.println();
		for(int i = 0; i < player.getItemCount(); i ++)
		{
			System.out.println(itemId.itemData[player.getInventory(i)].getTitle());
		}
	}
	
	private static PlayerClass playerInit()
	{
		switch(choice)
		{
			case "Fight for your life":
				return new PlayerClass(name, 0, "W");
			case "Pray to the gods":
				return new PlayerClass(name, 2, "M");
			case "Conceal your presence":
				return new PlayerClass(name, 1, "R");
		}
		return new PlayerClass();
	}
	
	public static void levelUp()
	{
		if(player.setCrrLevel())
		{
			player.setMaxAtk(itemId.itemData[player.getEqItem()].getAtk());
			player.setMaxHp();
			enemyScaling();
			System.out.println(player.getName() + " has advanced to level " + player.getCrrLevel() + ".");
			System.out.println();
			player.toString();
			System.out.println();
			enemy.enemyData[1].toString();
			//System.out.println(enemy.enemyData[1].getLootId());
		}
	}
}
