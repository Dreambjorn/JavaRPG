package mainGame;

import entity.EnemyList;
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
		
		for(int i = 0; i < enemy.getCount(); i ++)
			enemy.enemyData[i].setMaxAtk(itemId.itemData[enemy.enemyData[i].getEqItem()].getAtk());
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
}
