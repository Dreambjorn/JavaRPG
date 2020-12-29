package mainGame;

import entity.EnemyList;
import entity.PlayerClass;
import itemDatabase.ItemList;
import regionsDatabase.RegionList;

public class DataInit 
{
	static RegionList region = new RegionList();
	static EnemyList enemy = new EnemyList();
	static ItemList itemId = new ItemList();
	
	public static void dataInit()
	{
		region.regionData();
		enemy.enemyData();
		itemId.itemData();
		GameRun.player.setMaxAtk(itemId.itemData[GameRun.player.getEqItem()].getAtk());
		for(int i = 0; i < enemy.getCount(); i ++)
			enemy.enemyData[i].setMaxAtk(itemId.itemData[enemy.enemyData[i].getEqItem()].getAtk());
	}
	
	public static PlayerClass playerInit()
	{
		//System.out.println(SceneController.choice);
		switch(SceneController.choice)
		{
			case "Fight for your life":
				return new PlayerClass("Shiro", 0, "W");
			case "Pray to the gods":
				return new PlayerClass("Rin", 2, "M");
			case "Conceal your presence":
				return new PlayerClass("Natsume", 1, "R");
		}
		return new PlayerClass();
	}
	
	public static void enemyScaling()
	{
		for(int i = 0; i < enemy.getCount(); i ++)
		{
			enemy.enemyData[i].scale();
			enemy.enemyData[i].setMaxAtk(itemId.itemData[enemy.enemyData[i].getEqItem()].getAtk());
			enemy.enemyData[i].setMaxHp();
		}
	}
	
	public static void resetData()
	{
		region = new RegionList();
		enemy = new EnemyList();
		itemId = new ItemList();
	}
}
