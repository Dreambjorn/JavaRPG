package mainGame;

import java.util.Random;
import entity.Enemy;

public class Reward 
{
	public static void levelUp()
	{
		if(GameRun.player.setCrrLevel())
		{
			GameRun.player.setMaxAtk(DataInit.itemId.itemData[GameRun.player.getEqItem()].getAtk());
			GameRun.player.setMaxHp();
			DataInit.enemyScaling();
		}
	}
	
	public static void loot(Enemy enemy)
	{
		Random rand = new Random();
		
		int random = 20 + rand.nextInt(50);
		if (random >= 45)
		{
			GameRun.player.setInventory(enemy.getLootId());
		}
	}
}
