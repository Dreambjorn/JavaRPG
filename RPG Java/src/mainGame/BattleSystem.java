package mainGame;

import java.util.Random;
import entity.Enemy;

public class BattleSystem extends GameRun 
{
	private static Enemy crrEnemy;
	
	public static void autoBattle(int enemyId, int quantity)
	{
		// Battle system: (need a separate class for the battle system)
		crrEnemy = enemy.enemyData[enemyId];
		enemyQtInit(quantity);
		
		Random rand = new Random();
		while (player.getCrrHp() > 0 && crrEnemy.getCrrHp() > 0) // -> for the upcoming button from the GUI - method 
			//to simply decrease the enemy hpbased on player's attack
		{
			crrEnemy.setCrrHp(player.getMaxAtk());
			
			if (crrEnemy.getCrrHp() <= 0)
				break;
			
			int random = 20 + rand.nextInt(60);
			if (random >= 60)
				player.setCrrHp(crrEnemy.getMaxAtk());
			
			if (player.getCrrHp() <= 0)
				break;
		}
		
		System.out.println(player.getName() + "'s remaining HP: " + player.getCrrHp());
		System.out.println(crrEnemy.getName() + "'s remaining HP: " + crrEnemy.getCrrHp());
		
		if(player.getCrrHp() > 0)
		{	
			player.resetHp();
			System.out.println(player.getName() + "'s HP has been restored to " + player.getCrrHp() + ".");
			
			player.setCrrExp(crrEnemy.getBaseExp());
			levelUp();
			
			int random = 20 + rand.nextInt(50);
			if (random >= 45)
			{
				player.setInventory(crrEnemy.getLootId());
			}
		}
		else
			System.out.println("YOU DIED!");
	}
	
	public static void manualBattle(int enemyId, int quantity)
	{
		crrEnemy = enemy.enemyData[enemyId];
		enemyQtInit(quantity);
		
		Random rand = new Random();
		if (player.getCrrHp() > 0 && crrEnemy.getCrrHp() > 0) // -> for the upcoming button from the GUI - method 
			//to simply decrease the enemy hpbased on player's attack
		{
			crrEnemy.setCrrHp(player.getMaxAtk());
			
			if (crrEnemy.getCrrHp() <= 0)
				checkBattle = true;
			
			int random = 20 + rand.nextInt(60);
			if (random >= 60)
				player.setCrrHp(crrEnemy.getMaxAtk());
			
			if (player.getCrrHp() <= 0)
				checkBattle = true;
		}
		System.out.println(player.getName() + "'s remaining HP: " + player.getCrrHp());
		System.out.println(crrEnemy.getName() + "'s remaining HP: " + crrEnemy.getCrrHp());
		if(player.getCrrHp() > 0)
		{	
			player.resetHp();
			System.out.println(player.getName() + "'s HP has been restored to " + player.getCrrHp() + ".");
		}
		else
			System.out.println("YOU DIED!");
	}
		
	public static void enemyQtInit(int quantity)
	{
		int aux = quantity;
		while(aux != 1)
		{
			crrEnemy.setCrrHp(-crrEnemy.getCrrHp());
			crrEnemy.setMaxAtk(crrEnemy.getMaxAtk());
			crrEnemy.setBaseExp(crrEnemy.getBaseExp());
			aux --;
		}
	}
}
