package MainGame;
import ItemDatabase.ItemList;

import java.util.Random;
import java.util.Scanner;
import Entity.PlayerClass;
import Entity.EnemyList;

public class GameRun 
{
	public static void main(String[] args)
	{
		//Scanner input = new Scanner(System.in);
		//String role = input.nextLine();
	
		PlayerClass player = new PlayerClass("Waifu", 0, "M");
		EnemyList enemy = new EnemyList();
		ItemList itemId = new ItemList();
	
		enemy.enemyData();
		itemId.itemData();
		player.setMaxAtk(itemId.itemData[2].getAtk());
		
		itemId.itemData();
		enemy.enemyData[0].setMaxAtk(itemId.itemData[enemy.enemyData[0].getEqItem()].getAtk());
		player.toString();
		System.out.println("\n");
		enemy.enemyData[0].toString();
		System.out.println("\n");
		//input.close();
		//Battle system: 
		Random rand = new Random();
		while(player.getCrrHp() > 0 && enemy.enemyData[0].getCrrHp() > 0)
		{
			enemy.enemyData[0].setCrrHp(player.getMaxAtk());
			if(enemy.enemyData[0].getCrrHp() <= 0)
				break;
			int random = 15 + rand.nextInt(60);
			if(random >= 60)
				player.setCrrHp(enemy.enemyData[0].getMaxAtk());
			if(player.getCrrHp() <= 0)
				break;
		}
		System.out.println(player.getName() + "'s remaining HP: " + player.getCrrHp());
		System.out.println(enemy.enemyData[0].getName() + "'s remaining HP: " + enemy.enemyData[0].getCrrHp());
	}
}
