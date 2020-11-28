package MainGame;

import ItemDatabase.ItemList;

import java.util.Random;
import java.util.Scanner;
import Entity.PlayerClass;
import Entity.EnemyList;

public class BattleSystem 
{
	public String weapon;
	public int hp;
	public String name;
	//public static void main(String[] args) 
	public void Battle()
	{
		// Scanner input = new Scanner(System.in);
		// String role = input.nextLine();

		PlayerClass player = new PlayerClass("Waifu", 0, "M");
		EnemyList enemy = new EnemyList();
		ItemList itemId = new ItemList();

		enemy.enemyData();
		itemId.itemData();
		player.setMaxAtk(itemId.itemData[2].getAtk());
		name = player.getName();
		weapon = itemId.itemData[player.getEqItem()].getTitle(); ////
		hp = player.getMaxHp(); ///
		// need a separate class + method for initializing the enemies+items
		itemId.itemData();
		enemy.enemyData[0].setMaxAtk(itemId.itemData[enemy.enemyData[0].getEqItem()].getAtk());
		
		player.toString();
		System.out.println("\n");
		
		enemy.enemyData[0].toString();
		System.out.println("\n");
		// input.close();
		// Battle system: (need a separate class for the battle system)
		Random rand = new Random();
		while (player.getCrrHp() > 0 && enemy.enemyData[0].getCrrHp() > 0) // -> for the upcoming button from the GUI - method 
			//to simply decrease the enemy hpbased on player's attack
		{
			enemy.enemyData[0].setCrrHp(player.getMaxAtk());
			
			if (enemy.enemyData[0].getCrrHp() <= 0)
				break;
			
			int random = 15 + rand.nextInt(60);
			if (random >= 60)
				player.setCrrHp(enemy.enemyData[0].getMaxAtk());
			
			if (player.getCrrHp() <= 0)
				break;
		}
		System.out.println(player.getName() + "'s remaining HP: " + player.getCrrHp());
		System.out.println(enemy.enemyData[0].getName() + "'s remaining HP: " + enemy.enemyData[0].getCrrHp());
	}
}
