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
		
		for(int i = 0; i < 3; i ++)
			enemy.enemyData[i].setMaxAtk(itemId.itemData[enemy.enemyData[i].getEqItem()].getAtk());
	}
}
