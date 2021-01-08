package mainGame;

import java.util.Random;
import entity.Enemy;

public class BattleSystem extends GameRun 
{
	public static Enemy crrEnemy;
	public static boolean checkPlayer = false;
	public static boolean checkBattle = false;
	public static boolean checkQt = false;
	public static boolean hitCheck = false;
	public static void autoBattle(int enemyId, int quantity)
	{
		// Battle system: (need a separate class for the battle system)
		crrEnemy = enemy.enemyData[enemyId];

		if(checkQt == false)
			enemyQtInit(quantity, enemyId);
		
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
		
		//System.out.println(player.getName() + "'s remaining HP: " + player.getCrrHp());
		//System.out.println(crrEnemy.getName() + "'s remaining HP: " + crrEnemy.getCrrHp());
		
		if(player.getCrrHp() > 0)
		{	
			player.resetHp();
			//System.out.println(player.getName() + "'s HP has been restored to " + player.getCrrHp() + ".");
			
			player.setCrrExp(crrEnemy.getBaseExp());
			Reward.levelUp();
			Reward.loot(crrEnemy);	
		}
		/*else
			System.out.println("YOU DIED!");*/
	}
	
	public static void manualBattle(int enemyId, int quantity)
	{
		crrEnemy = enemy.enemyData[enemyId];
		
		if(checkQt == false)
			enemyQtInit(quantity, enemyId);
		
		Random rand = new Random();
		System.out.println(crrEnemy.getCrrHp());
		System.out.println(crrEnemy.getMaxAtk());
		if (player.getCrrHp() > 0 && crrEnemy.getCrrHp() > 0) // -> for the upcoming button from the GUI - method 
			//to simply decrease the enemy hpbased on player's attack
		{
			crrEnemy.setCrrHp(player.getMaxAtk());
			
			if (crrEnemy.getCrrHp() <= 0)
				checkBattle = true;
			
			int random = 20 + rand.nextInt(60);
			if (random >= 60)
			{
				player.setCrrHp(crrEnemy.getMaxAtk());
				hitCheck = true;
			}
			else
				hitCheck = false;
			
			if (player.getCrrHp() <= 0)
			{	
				checkPlayer = true;
				player.setToZero();
			}
			else if(crrEnemy.getCrrHp() <= 0)
			{
				checkBattle = true;
				crrEnemy.setToZero();
				Reward.levelUp();
			}
		}
		
		//System.out.println(player.getName() + "'s remaining HP: " + player.getCrrHp());
		//System.out.println(crrEnemy.getName() + "'s remaining HP: " + crrEnemy.getCrrHp());
		
		if(checkBattle == true)
		{	
			player.resetHp();
			//System.out.println(player.getName() + "'s HP has been restored to " + player.getCrrHp() + ".");
		}
		/*else if(checkPlayer == true)
			System.out.println("YOU DIED!");*/
	}
		
	public static void enemyQtInit(int quantity, int id)
	{
		int aux = quantity;
		int maxAtkAux = crrEnemy.getMaxAtk();
		int crrHpAux = crrEnemy.getCrrHp();
		int baseExpAux = crrEnemy.getBaseExp();
		while(aux != 1)
		{
			crrEnemy.setCrrHp(-crrHpAux);
			crrEnemy.qtMaxHp(crrEnemy.getCrrHp());
			crrEnemy.setMaxAtk(maxAtkAux);
			crrEnemy.setBaseExp(baseExpAux);
			aux --;
		}
		//crrEnemy.setBaseExp(crrEnemy.getBaseExp());
		//System.out.println(enemy.enemyData[1].getMaxHp());
		//System.out.println(crrEnemy.getMaxHp());
		checkQt = true;
	}
	
	public static void preInitEnemy()
	{
		crrEnemy = enemy.enemyData[1];
	}
}
